package day23_Arrays;

import day12_Scanner.ScannerIntro;

import java.util.Scanner;

public class PrintMonths {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

       String[] months = {"January", "February", "March", "April", "May", "June","July", "August", "September",
      "October", "November", "December"};

      //index from 0-11, since 0 iz included


        System.out.println("Enter number:");
        int number = new Scanner(System.in).nextInt();
        if(number>=1 && number<=12) {
            System.out.println(months[number - 1]);
        }else{
            System.out.println("Invalid number");
        }




scan.close();
    }
}
