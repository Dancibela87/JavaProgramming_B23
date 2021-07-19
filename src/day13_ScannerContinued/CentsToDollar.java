package day13_ScannerContinued;

import java.util.Scanner;

public class CentsToDollar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cents =input.nextInt();

        int dollar = cents/100;
        int remainderCents = cents%100;//cents%=100 prints differently, check

if(cents>=0) {
    if (remainderCents == 0) {
        System.out.println(cents + " equals to " + dollar + " dollars");

    } else {
        System.out.println(cents + " equals to " + dollar + " dollars and " + remainderCents + " cents");
    }
}else{
    System.out.println("Invalid number");
}



    }
}
/*
. Write a program that can convert cents to dollars,
if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

                Enter cents
                300 cents equal to: 3 dollars
 */