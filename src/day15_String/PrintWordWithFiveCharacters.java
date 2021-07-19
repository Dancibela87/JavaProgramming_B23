package day15_String;

import java.util.Scanner;
import java.util.SortedMap;

public class PrintWordWithFiveCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan. next();

        int num = word.length();

        String result = "";

        if(num<5){
            System.out.println("too short");
        }else if(num>5){
            System.out.println("too long");
        }else{
           result = "" +word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);



           /* result +=word.charAt(4);
            result+=word.charAt(3);
            result+= word.charAt(2);
            result+=word.charAt(1);
            result+=word.charAt(0);*/
        }

        System.out.println("result = " + result);




        scan.close();







    }
}
