package newMethodTasks;

import java.util.Scanner;

public class CleanString {
    public static String clean (String text , String badWord) {
        String clean  = "";
        String[] arr = text.split(" ");

        for (int i = 0; i < arr.length; i++) {
             if(arr[i].equals(badWord)){
                 continue;
             }
             clean += arr[i];

        }
        return clean;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }




}
/*
This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.
 */