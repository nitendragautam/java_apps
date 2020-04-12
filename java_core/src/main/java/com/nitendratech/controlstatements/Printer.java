package com.nitendratech.controlstatements;

/**
 * Created by nitendragautam on 9/17/2019.
 */

/**
 * Switch Statement needs break statement after the case statement.
 * Default case does not need the break statement as there is nothing to loop for
 *
 */
public class Printer {
    private boolean isOn;
    private String modelNumber;

    // Public Constructor
    public Printer(boolean isOn, String modelNumber){
        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }

    public void print(int copies){



        switch (copies)
        {

            case 0:

                break;

            case 1:
                if (isOn){
                    System.out.println(modelNumber  +" is On!");
                }
                else {
                    System.out.println(modelNumber + " is Off");
                }
                break;
            case 2:
                if (isOn){
                    System.out.println(modelNumber  +" is On!");
                    System.out.println(modelNumber  +" is On!");
                }
                else {
                    System.out.println(modelNumber + " is Off");
                    System.out.println(modelNumber + " is Off");
                }
                break;

            default: System.out.println("Number of copies is not Supported !");
        }




    }


    private void print(String text){
        System.out.println(text);
    }

    public String getModelNumber(){
        return modelNumber;
    }

}
