package day17_StringMethods;

import java.util.Scanner;

public class ValidWeb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the website");
        String website = scan.next();

        boolean starts = website.startsWith("www.");
        boolean ends =website.endsWith(".com") || website.endsWith(".edu") ||website.endsWith(".gov");

        if(starts== true && ends ==true){
            System.out.println(website+ " is valid");
        }else{
            System.out.println(website+ " is invalid");
        }




scan.close();

    }
}
/*
 write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */