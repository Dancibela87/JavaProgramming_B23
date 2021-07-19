package day32_MethodOverloading;

import java.util.Arrays;

public class MethodTask2 {
    public static void main(String[] args) {

        int arr3[] = {1,2,3,4,5,6};
        int element = 5;
        arr3 = addElementToArray(arr3, element);
        System.out.println(Arrays.toString(arr3));
    }

    //add num to int array
   public static int[] addElementToArray(int[] array, int n){
       /*
       int[] arr2 = new int [array.length + 1];
       int i = 0;
       for (int each : array) {
          arr2[i] = each;
       }
       arr2[i] = n;

        */

       int arr2[] = Arrays.copyOf(array, array.length+1);
       arr2[arr2.length-1] = n;

       return arr2;
   }

   //add decimal num to double arr
   public static double[] addElementToArray(double[] arr, int n) {
       double[] result = Arrays.copyOf(arr, arr.length+1);
       result[result.length-1] = n;

       return result;
   }

   //add string to the string array
    public static String[] addElementToArray(String [] arr, String word ){
        String[] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1] = word;

        return result;
    }

    //add char to char array
    public static char[] addElementToArray(char[] arr, char ch){
        char[] result =  Arrays.copyOf(arr, arr.length+1);
        result[result.length-1] = ch;

        return result;
    }





}
/*
 1. create a return method called addInteger that can add an Integer number after the  last index of an integer array

    2. create a return method called addDouble that can add a double number after the last index of a double array

    3. create a return method called addString that can add a String after the last index of a String array

    4. create a return method called addChar that can add a char after last index of a char array
 */