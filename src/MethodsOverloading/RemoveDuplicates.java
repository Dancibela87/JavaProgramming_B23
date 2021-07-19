package MethodsOverloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[]arr ={1,1,2,2,2,2,3,3,3,3};
        System.out.println(Arrays.toString(removeDuplicates(arr)));

        String[] arr1 ={"da","da","ba"};
        System.out.println(Arrays.toString(removeDuplicates(arr1)));
    }

    //remove duplicates from int array
    public static int[] removeDuplicates(int[] arr){
           int[] arr2 = {};
           
        for (int each : arr) {
            if(!ArraysUtility.containsElement(arr2,each)){
                arr2 =ArraysUtility.addElement(arr2,each);
            }
            
        }
        
        return arr2;




}

    //remove duplicates from double array
    public static double[] removeDuplicates(double[] arr){
        double[] arr2 = {};

        for (double each : arr) {
            if(!ArraysUtility.containsElement(arr2,each)){
                arr2 =ArraysUtility.addElement(arr2,each);
            }

        }

        return arr2;




    }

    //remove duplicates from string array
    public static String[] removeDuplicates(String[] arr){
        String[] arr2 = {};

        for (String each : arr) {
            if(!ArraysUtility.containsElement(arr2,each)){
                arr2 =ArraysUtility.addElement(arr2,each);
            }

        }

        return arr2;




    }

    //remove duplicates from char array
    public static char[] removeDuplicates(char[] arr){
        char[] arr2 = {};

        for (char each : arr) {
            if(!ArraysUtility.containsElement(arr2,each)){
                arr2 =ArraysUtility.addElement(arr2,each);
            }

        }

        return arr2;




    }




}
/*
create method overloading for removing duplicate elements from given type of array
 */