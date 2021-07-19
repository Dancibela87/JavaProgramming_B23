package day21_LoopsAgain;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum =0;
        int n =0;

        while(n>=0) {   //or we can do break to stop loop when number is negative.

            System.out.println("Enter the number:");
            n = scan.nextInt();
            sum+=n;
        }
        System.out.println(sum);





   scan.close();



    }
}
