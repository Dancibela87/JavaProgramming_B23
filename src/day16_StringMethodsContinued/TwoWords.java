package day16_StringMethodsContinued;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter two words:");
        String word1 =scan.next();
        String word2 = scan.next();

        if(word1.length()==2&& word2.length()==2) {
            String result = word1.substring(1) + word2.substring(1);

            System.out.println("result = " + result);
        }else{
            System.out.println("too short");
        }
        //System.out.println(word1.substring(1) + word2.substring(1));


        scan. close();







    }








}
