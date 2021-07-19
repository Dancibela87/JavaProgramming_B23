package day15_String;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class NameForming {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name ");
        
        String name = scan.next().trim();
         name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        System.out.println("Enter yor last name");
        String last = scan.next().trim();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();


        System.out.println(name+" "+last);

        

        
        
        
        
        
        
        
        
        
        
        
    }
}/*
enter first name
make sure there is no white space
make sure first ch is upper case and rest are lower case*/


