package day17_StringMethods;

import java.util.Locale;
import java.util.Scanner;

public class CompareCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter a word: ");
        String word = scan.next();

        String first = word.substring(0,1);//.toLowerCase();
        String last = word.substring(word.length()-1);//.toLowerCase();  another way of doing it

       if( first.equalsIgnoreCase(last)){
            System.out.println("Characters are the same.");
        }else {
            System.out.println("Characters are not the same.");
        }











     scan.close();



    }
}
/*
write a program that can check if the first and last characters
of the string are same. ignore upper and lower cases.
            ex:
                level
            output:
                same
 */