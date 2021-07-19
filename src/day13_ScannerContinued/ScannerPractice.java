package day13_ScannerContinued;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You are full time employee:");
        boolean isFullTime = input.nextBoolean();

        System.out.println("Are you an adult:");
        boolean adult= input.nextBoolean();

        System.out.println("Are you married:");
        boolean isMarried = input.nextBoolean();


        System.out.println("isFullTime = " + isFullTime);
        System.out.println("adult = " + adult);
        System.out.println("isMarried = " + isMarried);






    }
}
