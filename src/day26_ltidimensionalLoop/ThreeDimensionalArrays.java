package day26_ltidimensionalLoop;

import java.util.Arrays;

public class ThreeDimensionalArrays {
    public static void main(String[] args) {

        //int[] nums = {1,2,3};  // length == 3
        // int[][] nums = { {1,2,3},{4,5,6} }; // length == 2
        int[][][] arr3D = {  {{1,2,3},{4,5,6}}, {{7,8,},{9,10}}  };
                              //0                  1     length == 2
        //firts[] represents the number of 2d, second[] represents the index num od 1d array. and third []
        // represents index numbers of elements.

        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][0]));
        System.out.println(arr3D[1][0][1]);
        System.out.println(Arrays.deepToString(arr3D));

        System.out.println("____________________________________________");

        for (int[][] each2D : arr3D){  // getting each 2d array from 3d array

            for ( int[] each : each2D){  //gets 1d arrays from 2d array
                for( int element : each){ //hets each element from 1d array
                    System.out.print(element+" ");
                }
                System.out.println();// it prints each single array in separate line. Remember this
            }

        }

        System.out.println("____________________________________________");

         //FOR DIMENSIONAL ARRAY -  we will not use this much

        int[][][][] arr4D = {  {  {{1,2,3},{4,5,6}}, {{7,8,},{9,10}}  },  {  {{1,2,3},{4,5,6}}, {{7,8,},{9,10}}  } };










    }
}
