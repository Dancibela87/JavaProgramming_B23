package day13_ScannerContinued;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter miles:");
        double miles = input.nextDouble();

        double km = miles*1.609;
        System.err.println(miles+" equals to "+km+" km");


    }





}
/*
Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */