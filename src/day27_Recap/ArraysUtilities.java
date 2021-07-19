package day27_Recap;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {

        //Arrays.copyOf();

        int[] nums = {1,2,3};  // try to put size lower than one you copied

        int[] nums2 = Arrays.copyOf(nums,5);//check if you can do it other way around
        //it means that you copied the nums and added two characters
        //5 is total size, it will add zeros

        System.out.println(Arrays.toString(nums2));

        System.out.println("_____________________________________");

        //merge two arrays

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};

        int[] arr3 = Arrays.copyOf(arr1, arr1.length +arr2.length);
        //this sorted elements from first and set the size of both

        int i = arr1.length;//it is 4, and to add rest to third array , we have to start from 4th index
        for (int each : arr2){

            arr3[i++] = each;
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("_________________________________________________________");

        //Arrays.copyOfRange();

        int[] data = {10,20,30,40,50,60,70,80,90};
        int[] someData = Arrays.copyOfRange(data, 2,6+1);
        //similar to substring, it does not include the last character

        System.out.println(Arrays.toString(someData));

        System.out.println("_____________________________________________________________");

        char[] chars = new char[26];//this declares the size
        int k = 0;

        for (char j ='A' ; j <= 'Z' ; j++) {// goes through all the elements of the alphabet

           chars[k++] = j;

        }

        System.out.println(Arrays.toString(chars));


        char[] firstTenLetters = Arrays.copyOfRange(chars,0,10);//9+1 is the same as 10
        System.out.println(Arrays.toString(firstTenLetters));

        char[] last10Letters = Arrays.copyOfRange(chars, chars.length-10,chars.length );
        System.out.println(Arrays.toString(last10Letters));








    }
}
