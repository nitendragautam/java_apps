package com.nitendratech.controlstatements;

/**
 * Created by nitendragautam on 9/19/2019.
 */
public class PrinterMain {

    public static void main(String [] args){
        Printer myPrinter = new Printer(false,"My Printer");

        myPrinter.print(3);
    }
}
