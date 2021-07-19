package day12_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//memorize,now we can use it.

        System.out.println("enter number:");
         int num1 = input.nextInt();

        System.out.println("Enter second number: ");
         int num2 = input.nextInt();

         int addition = num1 +num2;
         int substraction = num1 - num2;
         int multiplication = num1 * num2;
         int division = num1/num2;

        System.out.println("addition = " + addition);
        System.out.println("substraction = " + substraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);








    }



}
