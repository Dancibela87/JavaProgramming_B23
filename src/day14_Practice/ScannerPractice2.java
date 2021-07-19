package day14_Practice;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the zip code:");
        long zip = scan.nextLong();

        System.out.println("Enter the number of people you live with:");
        byte nPeople = scan.nextByte();

        System.out.println("Are you married:");
        boolean isMarried = scan.nextBoolean();//pay attention

        System.out.println("I see you are "+ ((isMarried)?"married":"not married")+
                " and live with "+nPeople+ "  people in your house which is in "+ zip+" area.");





scan.close();

    }
}
