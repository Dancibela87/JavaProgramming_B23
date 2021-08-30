package day49_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlings2 {
    public static void main(String[] args) {

        try{
            FileInputStream file = new FileInputStream("");
        }catch (FileNotFoundException e){
            e.printStackTrace();//to get full report of exception and report will be given after the print statement.So you will still be able to run code

        }
        //without try catch block you will not be able to execute the next part of the code.
        System.out.println("Test completed");

        System.out.println("_________________________________________________________");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Test completed");//printed after 5 seconds

        System.out.println("__________________________________________________________");
        try{

        System.out.println(150/0);
            System.out.println("Try block");

    }catch (IndexOutOfBoundsException e){
            System.out.println("Catch block");
        }finally {
            System.out.println("Finally block" );//always gets executed even if exception is not handled
        }
        System.out.println("my exception never been handled");

        System.out.println("__________________________________");

        try{
            System.out.println("Cybertek".charAt(-1));
            System.out.println("Try block");

        }catch (RuntimeException e){
            System.out.println("Catch blohk");
            System.exit(0);//this will stop finally block from execution
        }finally {
            System.out.println("Finally block");
        }
}
}

