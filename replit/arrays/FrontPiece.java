package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }





            if(size>=2){
                int newNum[] = {num[0], num[1]};
                System.out.println(Arrays.toString(newNum));
            }else{
                System.out.println(Arrays.toString(num));


            }




scan.close();




    }
}
/*
Given an int array num of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.
 */