package day17_StringMethods;

import java.util.Locale;
import java.util.Scanner;

public class ReturnInitials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name ");
       String name = scan.next();

        System.out.println("Enter last name");
        String lastName = scan.next();

       //String initials =name.charAt(0)+"."+lastName.charAt(0);
        //initials = initial.toUpperCase();- you have to reassign it

      // System.out.println(initials.toUpperCase());

        //this can be done using substring as well

        String initials = name.substring(0,1).toUpperCase()+"."+ lastName.substring(0,1).toUpperCase();
        System.out.println(initials);







        scan.close();

    }
}
/*
 write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
 */