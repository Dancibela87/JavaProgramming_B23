package day19_LoopsIntroForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = - 2147483648;//minimum integar number in java, if you put 0, negative numb can not be entered

        //whatever user enter will be larger than that number

        for (int i = 0; i < 5; i++) {    // how many time it will be executed
            System.out.println("Enter number: ");
            int n = scan.nextInt();
          if(n>max) {         //if the user enter number is greater than max value
              max = n;        //if true than n value will be assigned to max variable
          }

        }

        System.out.println(max);







scan.close();

    }
}
/*
enter number five times, and than return max num
 */