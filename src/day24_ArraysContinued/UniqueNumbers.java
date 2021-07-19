package day24_ArraysContinued;

import java.util.Arrays;

public class UniqueNumbers {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4};


        for(int j =0;j<arr.length;j++) {

            int element = arr[j];    //1 compare with each element to find out if it is repeat
            int count = 0;          //store the frequency of the variable element

            for (int i = 0; i < arr.length; i++) {//finds frequency of one element at the time
                if (arr[i] == element) {//if element is occurred in array
                    count++;
                }

            }
            if (count == 1) {   //to check if the element is unique
                System.out.print(element+" ");
            }

        }











    }
}
/*
 write a program that can print out the unique numbers from an array
  of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */