package day23_Arrays;

import java.util.Scanner;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String word = scan.next();

        String removeDup = "";

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);

            if(removeDup.contains(""+each)){
                continue;
            }
            removeDup += each;

        }

        String result ="";
        for (int j = 0; j <= removeDup.length()-1; j++) {

            char ch = removeDup.charAt(j);
            int frequency = 0;

            for (int i = 0; i <= word.length() - 1; i++) {
                char each = word.charAt(i);
                if (each == ch) {
                    frequency++;
                }
            }
            result+="" +ch + frequency;

        }
        System.out.println(result);












scan.close();


    }
}
