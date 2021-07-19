package MethodsOverloading;

import java.util.Arrays;

public class ReverseArray {

    // reverse array of int
    public static int[] reverseArray(int[] arr){
        int[] reversed = new int[arr.length];
        int j =0;
        for (int i = arr.length-1;i>=0; i--) {
            reversed[j++]= arr[i];
        }
        return reversed;
    }

    //reverse array of double
    public static double[] reverseArray(double[] arr){
        double[] reversed = new double[arr.length];
        int j =0;
        for (int i = arr.length-1;i>=0; i--) {
            reversed[j++]= arr[i];
        }
        return reversed;
    }

    //reverse array of String
    public static String[] reverseArray(String[] arr){
        String[] reversed = new String[arr.length];
        int j =0;
        for (int i = arr.length-1;i>=0; i--) {
            reversed[j++]= arr[i];
        }
        return reversed;
    }

    //reverse array of char
    public static char[] reverseArray(char[] arr){
        char[] reversed = new char[arr.length];
        int j =0;
        for (int i = arr.length-1;i>=0; i--) {
            reversed[j++]= arr[i];
        }
        return reversed;
    }



}
/*
1. create a method that can reverse an array of integer

    2. create a method that can reverse an array of double

    3. create a method that can reverse an array of String

    4. create a method that can reverse an array of char
 */