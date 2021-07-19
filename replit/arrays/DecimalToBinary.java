package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        int[] newArr = new int[binary.length];

        for (int i = 0; i < newArr.length; i++) {

            if(decimal>0){
                newArr[i] = decimal%2;
                decimal/=2;
            }
        }

        for (int i = newArr.length-1,j=0; i>=0;  i--,j++) {
            binary[j] = newArr[i];
        }

        System.out.println(Arrays.toString(binary));














input.close();

    }
}
/*
A Binary number is a number expressed in the base-2 numeral system or binary numeral system, which uses only two symbols: 0 (zero) and 1 (one). Each digit is referred to as a bit.

Given an int variable decimal, write java program to calculate binary value of the decimal variable and assign it to a binary array. Print out value of binary array matching below format. Feel free to use additional arrays or formulas.
 */