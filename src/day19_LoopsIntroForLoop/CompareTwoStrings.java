package day19_LoopsIntroForLoop;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 0;//50 100 112
        String result ="";

        for (int i = 0; i <2; i++) {
            System.out.println("Enter string:");
            String sen = scan.nextLine();

            if(sen.length()>max){  //50  30 100 112 5
               max = sen.length();
               result = sen;
            }

 
        }
        System.out.println(result);
        









    }
}
