package methods2;

import java.util.Scanner;

public class ExactNumber {
    public static String extractNum(String s) {
        String nums ="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                nums+=s.charAt(i);
            }

        }
        return nums;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}
/*
Create a method extractNum that cleans any non number string from a string it gets and returns the clean string

input:

s (string) - given String

return: string: a String of numbers only
 */