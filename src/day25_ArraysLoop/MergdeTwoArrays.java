package day25_ArraysLoop;

import java.util.Arrays;

public class MergdeTwoArrays {
    public static void main(String[] args) {

       int[] arr1 = {1,2,3,4};//interview question
       int[] arr2 = {5,6};

       int[] arr3 = new int [arr1.length + arr2.length];
       int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[j++]=arr2[i];

        }
        System.out.println(Arrays.toString(arr3));












    }
}
/*
. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
 */