package day16_StringMethodsContinued;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter tree words");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        int num1= word1.length();
        int num2 = word2.length();
        int num3 = word3.length();// boolean expression can be used

        if(num1==num2 && num2==num3){
            System.out.println("all words are the same");
        }else if(num1!=num2 && num2!=num3 && num1!=num3){
            System.out.println("all different lengths");
        }else{
            System.out.println("nor same or different");
        }



scan.close();



    }
}
/*
Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:print "Not Same nor Different lengths"
            - if all different length :  print "All different lengt
 */