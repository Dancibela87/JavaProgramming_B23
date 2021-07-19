package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] arr = str.split(", ");
        String shortest = arr[0];
        String arrWords = "";

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length()<shortest.length()){
                shortest = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].length() == shortest.length()){
                arrWords += arr[i]+", ";
            }
        }

        String[] shortestWords = arrWords.split(", ");
        Arrays.sort(shortestWords);
        System.out.println(Arrays.toString(shortestWords));



scan.close();




    }
}
/*
Write a program that will find out shortest words in the given string str.
 If there are few words that are evenly short, print them all.
  Use split method in order to split str string variable and create an array of strings.
 Print array with Arrays.toString() method. Sort array before printing.
 */