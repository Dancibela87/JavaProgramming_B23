package day17_StringMethods;

import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email address:");
        String email = scan.nextLine();

        boolean endsWith = email.endsWith("@gmail.com");

       if(endsWith){
           System.out.println("Valid email address.");
       }else{
           System.out.println("Email address is not valid.");
       }




scan.close();



    }
}
/*
 write a program to verify if the gmail is valid
            requirments:
                    a valid gmail account should end with @gmail.com
 */