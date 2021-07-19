package day18_StringPractice;

import java.util.Scanner;

public class WordJava {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String sen = "I like to learn C, C is cool";
        if(sen.indexOf("J")>=0){
            System.out.println("It  have java");
        }else{
            System.out.println("Does not have java");
        }

        System.out.println("_________________________");

        String sen2 ="I love Java, Java is cool";

        boolean unique = sen2.indexOf("Java") == sen2.lastIndexOf("Java");
        System.out.println("unique = " + unique);

        System.out.println("__________________________________________");

        String schoolName = "Cybertek School";
        String name  = schoolName.substring(0, schoolName.indexOf(" "));




scan.close();



    }
}
