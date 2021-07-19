package day23_Arrays;

public class Frequency {
    public static void main(String[] args) {
        
        String word ="aabcccd";
        int frequency =0;

        for (int i = 0; i < word.length(); i++) {
            
            char each = word.charAt(i);
            if(each=='b'){
                frequency++;
            }
            
        }
        System.out.println("frequency = " + frequency);



}}
/*
Write a program that can find the frequency of any given character
from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
 */