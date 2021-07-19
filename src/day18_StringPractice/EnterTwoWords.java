package day18_StringPractice;

import java.util.Scanner;

public class EnterTwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");

        String word1 = scan.next();
        String word2 = scan.next();


     /* boolean even = word1.charAt((word1.length()-1))==word2.charAt(0);

        if(even){
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }*/  //another way

        if(word1.substring(word1.length()-1).equalsIgnoreCase(""+word2.charAt(0))){

            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }

        //word1.toLowerCase().endsWith(word1.substring(0,1).toLowerCase();  another way






     scan.close();
    }
}
/*
 Ask user to enter two words.
  Then add them together and print.
  But if the last letter of the first word and the first
  letter of the last word is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
 */