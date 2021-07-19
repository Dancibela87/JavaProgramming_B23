package day19_LoopsIntroForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;  //largest integar in java

        for (int i = 0; i < 5 ; i++) {//will print enter number five times
            System.out.println("Enter number: ");
            int n = scan.nextInt();  //number that they will be entered
            if(n<min){
                min=n;
            }
        }
        System.out.println(min);




scan.close();





    }
}
