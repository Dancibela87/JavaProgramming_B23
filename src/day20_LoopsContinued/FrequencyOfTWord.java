package day20_LoopsContinued;

import java.util.Scanner;

public class FrequencyOfTWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        String word ="Java";
        int count =0;
        /*String s1 =sen.substring(0,4);
        String s2 =sen.substring(1,5);
        String s3 =sen.substring(2,6);
        String s4 =sen.substring(3,7);*/


        for (int i = 0; i <= sen.length()-4; i++) {
          if(sen.substring(i,i+4).equalsIgnoreCase("Java")){
           count++;

        }
        }
        System.out.println(count);





scan.close();


    }
}
/*
 write a program that can return the frequency of the a word Java
  from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2
 */