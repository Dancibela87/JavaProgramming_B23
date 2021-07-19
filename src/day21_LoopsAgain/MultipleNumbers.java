package day21_LoopsAgain;

import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = 5;
        int b = 44;

       /* if(b<0){  //way to convert negative number in positive number
            b*=-1;
        }*/

        int result = 0;

        for (int i = 0; i < b; i++) {
            result += a;
        }

        System.out.println(result);








    }
}
/*
write a program that can multiply two numbers without using * operator
 */