package newMethodTasks;

import java.util.Scanner;

public class LimitString {
    public static String limit(String text, int maxLength){

        String limit="";

        for (int i = 0; i < maxLength; i++) {
           limit += "" + text.charAt(i);


        }

         return limit;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));
    }


}
/*
This method gets a string and an int, it returns a string.

The method will limit the given String by a certain amount of characters(given int)
 */