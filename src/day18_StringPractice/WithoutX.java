package day18_StringPractice;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String  word = scan.next();

      boolean word1 = word.toLowerCase().startsWith("x");
     // word=word.substring(2); if you reassign that it gets changed, or another value is cretaed
     //this way it will print from index num 2
      if(word1){
          System.out.println(word.substring(1));
      }else{
          System.out.println(word);
      }

        System.out.println("____________________________________");



      String sentence ="I love Java programming language";

     if(sentence.toLowerCase().contains("java")){
         System.out.println("Has Java");
     }else{
         System.out.println("Does not have java");
     }

        System.out.println("________________________________");

     String s1 = "I love cats and dogs";

     boolean lovesCats = s1.toLowerCase().contains("cat");
     //equal method compares to whole strings , not if there is a word in string
        //if equal is used in this case it will return false
        //that is why we have to use contains method.



scan.close();

    }
}
/*
Ask user to enter a word.
 If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */