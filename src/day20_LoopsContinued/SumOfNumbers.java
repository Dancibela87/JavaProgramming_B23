package day20_LoopsContinued;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result =0;

        for (int i=0 ;i==0 ; ) {
            System.out.println("enter n:");
            int num = scan.nextInt();
            if(num<0){
                break;
            }
            result += num;

        }
        System.out.println("result = " + result);








scan.close();



    }
}
/*
 Write a program that calculates the sum of numbers
 entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */
