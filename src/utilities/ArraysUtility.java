package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //returning maximum number from the array
    public static int maxNumber (int[] numbers) {

        int max = numbers[0];
        for (int each : numbers) {
            if(each>max) {
                max=each;
            }
        }
        return max;
    }

    //max double from double arr
    public static double maxNumber (double[] numbers) {

        double max = numbers[0];

        for (double each : numbers) {
            if(each>max) {
                max=each;
            }
        }
        return max;
    }

    //returns minimum number from the array
    public static int minNumber (int[] numbers) {
        int min = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]<min) {
                min = numbers[i];
            }
        }
        return min;
    }

    //return min double from double array
    public static double minNumber (double[] numbers) {
        double min = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]<min) {
                min = numbers[i];
            }
        }
        return min;
    }

    //add num to int array
    public static int[] addElement(int[] array, int n){
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
    public static double[] addElement(double[] arr, double n) {
        double[] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1] = n;

        return result;
    }

    //add string to the string array
    public static String[] addElement(String [] arr, String word ){
        String[] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1] = word;

        return result;
    }

    //add char to char array
    public static char[] addElement(char[] arr, char ch){
        char[] result =  Arrays.copyOf(arr, arr.length+1);
        result[result.length-1] = ch;

        return result;
    }

    // merge two int arrays
    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int [arr1.length + arr2.length];
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        return arr3;

    }

    //merge two array of double
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        return arr3;
    }

    //merge two string arrays
    public static String[] merge(String[] arr1, String[] arr2) {

        String [] arr3 = new String[arr1.length + arr2.length];
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        return arr3;
    }

    //merge two char arrays
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        return arr3;
    }
    
    //remove given index num from in array
    public static int[] remove(int[] array, int index) {

        if(index<0 ||index>array.length-1){
            System.out.println("Invalid index");
            return array;
        }
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;

    }
    
    //remove index from double array
    public static double[] remove(double[] array, int index) {

        if(index<0 ||index>array.length-1){
            System.out.println("Invalid index");
            return array;
        }
        double[] newArray = new double[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;

    }
    
    //remove index from string array
    public static String[] remove(String[] array, int index) {

        if(index<0 ||index>array.length-1){
            System.out.println("Invalid index");
            return array;
        }
        String[] newArray = new String[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;

    }
    
    //remove index from char array
    public static char[] remove(char[] array, int index) {

        if(index<0 ||index>array.length-1){
            System.out.println("Invalid index");
            return array;
        }
        char[] newArray = new char[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        return newArray;

    }

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

    //if int array contains int element
    public static boolean containsElement(int[] arr, int element) {
        for (int each : arr) {
            if (each == element) {
                return true;
            }
        }

        return false;

    }

    //if double array contains double number
    public static boolean containsElement(double[] arr, double element) {
        for (double each : arr) {
            if (each == element) {
                return true;
            }
        }

        return false;

    }

    //if string array contains and string
    public static boolean containsElement(String[] arr, String element) {
        for (String each : arr) {
            if (each.equals(element)) {
                return true;
            }
        }

        return false;

    }

    //if char array contains char
    public static boolean containsElement(char[] arr, char element) {
        for (char each : arr) {
            if (each==element) {
                return true;
            }
        }

        return false;

    }

    // returns frequency of int in int array
    public static int frequencyOfElement(int[] arr, int element){

        int frequency=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                frequency++;
            }

        }
        return frequency;
    }

    //frequency od double in double array
    public static int frequencyOfElement(double[] arr, double element){

        int frequency=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                frequency++;
            }

        }
        return frequency;
    }

    //frequency of String in String array
    public static int frequencyOfElement(String[] arr, String element){

        int frequency=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(element)){
                frequency++;
            }

        }
        return frequency;
    }

    //frequency of char in char array
    public static int frequencyOfElement(char[] arr, char element){

        int frequency=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                frequency++;
            }

        }
        return frequency;
    }

    //unique elements from int array
    public static int[] uniqueElements(int[] arr){
        int[] result = {};

        for (int each : arr){
            if(ArraysUtility.frequencyOfElement(arr, each) == 1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //unique element from double array
    public static double[] uniqueElements(double[] arr){
        double[] result = {};

        for (double each : arr){
            if(ArraysUtility.frequencyOfElement(arr, each) == 1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //unique element from string array
    public static String[] uniqueElements(String[] arr){
        String[] result = {};

        for (String each : arr){
            if(ArraysUtility.frequencyOfElement(arr, each) == 1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //unique elements from char array
    public static char[] uniqueElements(char[] arr){
        char[] result = {};

        for (char each : arr){
            if(ArraysUtility.frequencyOfElement(arr, each) == 1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
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
