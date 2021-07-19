package day18_StringPractice;

import java.util.Scanner;

public class WordsAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        char firstCh = word.charAt(0);
        
        String result = "First character is";
        

        if (firstCh >= '0' && firstCh <= '9') {
           result+= "digit";
        } else if (firstCh >= 'a' && firstCh <= 'z') {
            result+= " lower case letter";
        } else if (firstCh >= 'A' && firstCh <= 'Z') {
            result+=" upper case letter";
        } else {
            result+=" special character";
        }
        System.out.println("result = " + result);


            scan.close();

    }
}
/*
 Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
 */