package day18_StringPractice;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int indexOf_ = email.indexOf("_");
        int inexOfAt =email.indexOf("@");

        String firstName = email.substring(0,indexOf_);
        String lastName = email.substring(indexOf_+1,inexOfAt);


            System.out.println(lastName + "_" + firstName + email.substring(inexOfAt));







scan.close();


    }
}
/*
 EmailTask1:
            Assume that email address is constructed by person's first name and followed by an underscore and last name.
            Write a program that can swap first name with last name in the email (Seperated by an underscore).
            If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */