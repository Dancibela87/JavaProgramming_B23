package day19_LoopsIntroForLoop;

import day12_Scanner.ScannerIntro;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word: ");
          String word = scan.next();
          String reverse = "";

        for (int i = word.length()-1; i >=0; i--) {
          reverse  +=word.charAt(i);
        }

       boolean isPal = word.equalsIgnoreCase(reverse);
        System.out.println("isPal = " + isPal);

        if(isPal){
            System.out.println(word +" is palindrome");
        }else{
            System.out.println(word +" is not palindrome");
        }






       scan.close();

    }
}
