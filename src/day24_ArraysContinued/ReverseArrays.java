package day24_ArraysContinued;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {

        int[] array  = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];//it has to be have capacity to contain the elements from array

        for (int i = array.length-1,j = 0 ; i >= 0 ; i--,j++){

          reversedArray[j] = array[i];//we get elements of array from last index and store it to the reversed array and store from index 0
        }


        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));

        //i is the index number of array
        // j is the index number of reversed array starting from index 0.it will stop when it reaches array length
        //j ending point could be declared as well, but it is unnecessary since it is the same length.




    }
}
/*
Write a program that can reverse an array of integers
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */