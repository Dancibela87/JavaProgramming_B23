package day13_ScannerContinued;

import java.util.Scanner;

public class FreeShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price:");
        double price = input.nextDouble();

        System.out.println("Are you prime member:");
        boolean isPrime = input.nextBoolean();

        double totalPrice = (isPrime)? price:(price>=25) ?price : price+3.99;

        System.out.println("totalPrice = $" + totalPrice);






    }
}
