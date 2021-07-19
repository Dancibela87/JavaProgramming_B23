package day19_LoopsIntroForLoop;

import java.util.Scanner;

public class SumOfAnyGivenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum =0;
        for (int i = 0; i <num; i++) {
            sum += i;
        }

        System.out.println(sum);




scan.close();

    }
}
/*
write a program that can calculate the sum of all numbers between 1 to
any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

                input : 200
                output : 20100
 */