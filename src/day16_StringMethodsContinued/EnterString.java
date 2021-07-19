package day16_StringMethodsContinued;

import java.util.Scanner;
import java.util.SortedMap;

public class EnterString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a text:");
        String word = scan.nextLine();

        if(word.length()==0){
            System.out.println("empty string");
        }else if(word.length()>3){
            System.out.println(word.substring(word.length()-3));
        }else{
            System.out.println(word);
        }

       // do this with ternary




       /* char lastSimbol=text.charAt(text.length()-1);
        char seconSimbol=text.charAt(text.length()-2);
        char thirdSimbol = text.charAt(text.length()-3);
        String result ="";

        for me to compare

        if(text.length()==0){
            result = "String is empty";
        }else if(text.length()>3){
            result ="" +lastSimbol +seconSimbol+thirdSimbol ;
        }else{
            result = text;
        }

        System.out.println(result);*/


    scan. close();



    }
}
/*
 write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters,
            print the last three characters
        if the string has less than or equal 3 characters,
            print the string itself

 */