package day18_StringPractice;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_"),email.indexOf("@"));
        String remain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

         firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1,email.indexOf("_")).toLowerCase();
         lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();



        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(remain);




scan.close();


    }
}
/*
 EmailTask2:
        Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that will print out information about user based on email. Print first name, last name, and domain.
           First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:

                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */