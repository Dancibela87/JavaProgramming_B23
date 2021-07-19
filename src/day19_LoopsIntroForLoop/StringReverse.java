package day19_LoopsIntroForLoop;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        String reverse ="";   //ankaD


        for (int i = sen.length()-1; i >= 0; i--) {
            reverse += sen.charAt(i)+" ";
        }
        System.out.print(reverse +" ");









    scan.close();

    }
}
