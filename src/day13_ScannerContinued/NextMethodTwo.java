package day13_ScannerContinued;

import java.util.Scanner;

public class NextMethodTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        scan.nextLine();//it takes everything that is left in scanner

        System.out.println("Enter your full name :");
        String fullName = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        
        
        
        
    }
}
