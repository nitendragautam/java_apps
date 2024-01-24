package com.nitendratech.javautilcode.remotework;

import com.jcraft.jsch.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by @author nitendratech on 1/23/24
 */
public class RemoteServerService {


    private static String SERVER_HOST =null;
    private static String USER_NAME =null;
    private static String PASS_PHRASE = null;


    public RemoteServerService(String serverHost,String userName,String passPhrase) {

        this.SERVER_HOST=serverHost;
        this.USER_NAME= userName;
        this.PASS_PHRASE =passPhrase;

    }


    /**
     * Opens a Connection for remoteServer which can be used to open a new remote Channel
     * @return
     */
    protected Session getJschSession(){
        JSch jsch = new JSch();
        Session remoteSession = null;
        try {
            remoteSession = jsch.getSession(USER_NAME, SERVER_HOST, 22);
            remoteSession.setPassword(PASS_PHRASE);
            remoteSession.setConfig("StrictHostKeyChecking","no");
            remoteSession.connect();

        }catch (JSchException js){js.printStackTrace();}

        return remoteSession;

    }


    /**
     * Gets the remote SFTP Channel which can be used for
     * @return
     */
    public ChannelSftp getRemoteSftpChannel(){
        ChannelSftp channelSftp =null;


        try {
            Channel channel = getJschSession().openChannel("sftp");
            channel.connect();
            channelSftp =(ChannelSftp)channel;

        }catch (JSchException e) {e.printStackTrace();}


        return channelSftp;
    }


    /**
     *Create a Directory using JSCH
     */
    public void createDirectory(ChannelSftp channelsftp,String remotePath){


        try {
            channelsftp.mkdir(remotePath);
            System.out.println("Folder Created "+remotePath);
        } catch (SftpException e) {
            e.printStackTrace();
        }
    }


    /**
     Delete a Folder along with its contents
     */

    public void deleteDirectory(ChannelSftp channel,String remotePath ,String remoteFileName){


        try {
            System.out.println("Deleting File "+remotePath);
            channel.cd(remotePath);
            //Check if remote Path is Empty
            if(channel.ls(remotePath).isEmpty()){
                channel.rmdir(remotePath);
            }else{
                channel.rm(remotePath+"/"+remoteFileName);
                System.out.println("Deleted File "+remoteFileName);

                channel.rmdir(remotePath);
                System.out.println("Deleted Remote Directory "+remotePath);
            }


        } catch (SftpException e) {
            e.printStackTrace();
        }
    }


    /*
    Get the file from remote Server as InputStream
     */
    public InputStream getFileRemoteServer(ChannelSftp channel, String remoteFilePath){
        InputStream in =null;
        try {
            in =channel.get(remoteFilePath);

        } catch (SftpException e) {
            e.printStackTrace();
        }
        return in;
    }


/*
Copy/Upload files to Remote server
 */

    public boolean copyFilesUsingJsch(ChannelSftp channel, String fileName, GZIPInputStream in , String remotePath){
        boolean result = false;

        try {
            channel.cd(remotePath); //navigate to remote Path

            channel.put(getByteArrayFromInputStream(in),fileName);

            System.out.println(" File Copied "+remotePath);
            channel.disconnect();
            result = true;

        }catch(SftpException e){
            e.printStackTrace();
        }
        return result;
    }



/*
Convert InputStream into ByteArrayInputStream with zipped Content

 */

    private static ByteArrayInputStream getByteArrayFromInputStream(GZIPInputStream in){

        byte[] buffer = new byte[60000];
        int bytesRead;
        ByteArrayInputStream bin =null;

        GZIPOutputStream gout =null;
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        try {
            gout = new GZIPOutputStream(bout);
            while ((bytesRead = in.read(buffer)) != -1) {
                gout.write(buffer, 0, bytesRead);
            }
            gout.finish();

            //ZippedContent
            byte[] data = bout.toByteArray();

            bin = new ByteArrayInputStream(data);


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            try {
                in.close();
                gout.close();
                bout.close();

            }catch(IOException e){
                e.printStackTrace();
            }
        }

        return bin;

    }
}
