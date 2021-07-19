package day26_ltidimensionalLoop;

import java.util.Arrays;

public class PutZerosAtTHeEnd {
    public static void main(String[] args) {

       // int[] array = {10, 0, 5, 0, 1, 0};

        int[] array = {0,10, 0, 5, 0, 1, 0, 300, 0, 52, 12, 0, 0,};

        int[] result = new int[array.length];//this would give you zeros

        int i = 0;//index number of array result - to act as this

        for(int each : array){  //10, 0, 5, 0, 1, 0
             if(each != 0){    //10,5,1 and rest of elements will be zero, since that is default value of int num in array
                result[i++]  = each;
                //i++  - or this way
             }

        }
        System.out.println(Arrays.toString(result));










    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                {10, 5, 1, 0, 0, 0}
      MUST use for each loop
 */