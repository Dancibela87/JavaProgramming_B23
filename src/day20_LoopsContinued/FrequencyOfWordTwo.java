package day20_LoopsContinued;

import java.util.Scanner;

public class FrequencyOfWordTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        String word = scan.next();
        int count = 0;


        for (int i = 0; i <=sen.length()-word.length(); i++) {
            if(sen.substring(i,i+word.length()).equalsIgnoreCase(word)){
                count++;
            }
            
        }

        System.out.println("count = " + count);
        
        
        
        
    }
}
