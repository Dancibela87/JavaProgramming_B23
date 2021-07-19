package day13_ScannerContinued;

import java.util.Scanner;

public class FirstInformation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary:");
        int salary = scan.nextInt();

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter full name: ");
        String fullName = scan.nextLine();

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);







    }
}
/*
salary nextInt
gender next()
fullName nextLine
 */

