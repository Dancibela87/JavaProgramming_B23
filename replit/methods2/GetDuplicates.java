package methods2;

import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.Scanner;

public class GetDuplicates {

    public static int getDup(String[] r) {
        int count = 0;
        for (String each : r) {
            if(frequency(r,each)>1){
                count++;
            }


        }

        return count;
    }
    public static  int frequency(String[] array,String word){
        int count=0;
        for (String each : array) {
            if(each.equals(word)){
                count++;
            }

        }
        return count;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

}
/*
getDup accepts an array and returns an int.

If there is any element is duplicated, the method counts how many of those present in the array
 */