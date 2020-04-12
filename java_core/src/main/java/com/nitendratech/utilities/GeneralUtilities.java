package com.nitendratech.utilities;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GeneralUtilities {

	/*
	 *  Downloads file in gz format in temporary directory 
	 */
	public void downloadFileFromInternet(String urlLink ,String fileName){
		
		String tempDir = System.getProperty("java.io.tmpdir");
		String outputPath = tempDir + "/" + fileName +".gz";
		
		try {
			URL url = new URL(urlLink);
			 URLConnection con = url.openConnection();
			    BufferedInputStream in = new BufferedInputStream(con.getInputStream());
			
			
			FileOutputStream fos = new FileOutputStream(outputPath); 
			 int i = 0;
			    byte[] bytesIn = new byte[3000000];
			    while ((i = in.read(bytesIn)) >= 0) {
			    	fos.write(bytesIn, 0, i);
			    	System.out.println("Downloading Data");
			    }
			    in.close();
			    fos.close();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	
	}
	
	
	/*
     * Read Config data from JSON File
     */
    public static JSONObject readJsonFromFile(String pathName) {
        String jsonData = "";
        BufferedReader br = null;
        JSONObject jsonObject = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(pathName));
            while ((line = br.readLine()) != null) {
                jsonData += line + "\n";
            }

            jsonObject = new JSONObject(jsonData);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (JSONException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonObject;

    }

    /**
     * Gives a Json Array given a Json Value
     * @param jsonValue
     * @return
     */
    public static String getJsonArray(String jsonValue){

        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jsonValue);

       return jsonArray.toString();
    }


    /**
     * Downloads the file in Local Path
     */


    public static void downloadStreamAsGzippedFile(InputStream in, String fileName, String localDownloadPath){
        FileOutputStream fout = null;
        BufferedInputStream bin = null;

        int blockSizeRead;

        String tempFilePath=localDownloadPath + fileName+ "-"+".gz";

        try {
            fout = new FileOutputStream(tempFilePath);

            bin = new BufferedInputStream(in);
            byte[] bufferInput = new byte[60000];

            while((blockSizeRead=bin.read(bufferInput)) > 0){
                fout.write(bufferInput ,0,blockSizeRead); //Reading Block Size

            }
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e ){
            e.printStackTrace();
        } finally {
            try {
                bin.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }


/*
Reads Gzipped File from File Path and Converts to GzipInput Stream
 */

public static GZIPInputStream convertGziptoGzipInputStream(String filePath){
    GZIPInputStream in = null;

    try {
        in = new GZIPInputStream( new FileInputStream(filePath));
    } catch(FileNotFoundException e){
        e.printStackTrace();
    }catch (IOException e){
        e.printStackTrace();
    }
    return in;
}
    public static ByteArrayInputStream getByteArrayFromInputStream(GZIPInputStream in){

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



    /*
    Downloads the File and Splits it according to size
    {currently not working)
     */
    public  void downloadAndSplitGzipFile(InputStream in, String fileName,String localDownloadPath){
        BufferedInputStream bin =null;

        int BLOCK_SIZE= 9437184;


        byte[] buffer= new byte[BLOCK_SIZE];
        //remaining is the number of bytes to fill the buffer
        int remaining=buffer.length;
//blockNumber is incremental each time a block of 9437184 bytes is read
        int blockNumber=1;
        while(true){
            try {

                bin = new BufferedInputStream(in);
                int read = bin.read(buffer,buffer.length-remaining,remaining);
                if(read>=0) {//read some bytes
                    remaining -= read;
                    if (remaining == 0) { //When the buffer is full
                        System.out.println("Writing Full Buffer "+(buffer.length - remaining));
                        writeFileBlock(blockNumber, buffer, buffer.length - remaining, fileName, localDownloadPath);
                        blockNumber++;
                        remaining = buffer.length;
                    }

                }else{
                    //When end of the file is reached reamining bytes in buffer are writtten to the output file
                    if(remaining < buffer.length){
                        writeFileBlock(blockNumber, buffer, buffer.length - remaining, fileName, localDownloadPath);
                        System.out.println("Writing Remaining Buffer "+(buffer.length - remaining));
                    }
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private void writeFileBlock(int blockNumber ,byte[] buffer ,int length,String fileName,String localDownloadPath){
        String tempFilePath=localDownloadPath+fileName+"-"+String.format("%03d",blockNumber)+".gz";
        GZIPOutputStream fout =null;
        try {
            fout = new GZIPOutputStream(new FileOutputStream(tempFilePath));
            fout.write(buffer, 0, length); //blocksSize Read
            fout.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /*
    Check if InputStream is Gzipped
     */
    public static boolean isGzipped(InputStream in){
        if(!in.markSupported()){
            in = new BufferedInputStream(in);
        }
        in.mark(2);
        int magic = 0;
        try {
            magic = in.read() & 0xff |((in.read() << 8) & 0xff00);
            in.reset();
        }catch (IOException e){
            e.printStackTrace(System.err);
            return false;
        }
        return magic == GZIPInputStream.GZIP_MAGIC;

    }


}
