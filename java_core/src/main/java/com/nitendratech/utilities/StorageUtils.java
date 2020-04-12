package com.nitendratech.utilities;

/**
 * Created by nitendragautam on 10/10/2018.
 */
public class StorageUtils {

    public final static long SIZE_KB = 1024L;
    public final static long SIZE_MB = SIZE_KB * SIZE_KB;
    public final static long SIZE_GB = SIZE_MB * SIZE_KB;

    public static String getSizeText(long size){

        String text;

        if (size >= 100000000)
            text = String.format("%.2f", ((float) size/SIZE_GB)) + " GB";
        else if (size >=1000000)
            text = String.format("%.2f", ((float) size/SIZE_MB)) + " MB";
        else if (size >=1000)
            text = String.format("%.2f", ((float) size/SIZE_KB)) + " KB";
        else
            text = size + " B";

        text = text.replace(',' ,'.');
        return text;
    }
    public static void main(String args[]){

        System.out.println(getSizeText(1000000000));
    }
}
