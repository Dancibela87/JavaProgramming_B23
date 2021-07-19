package day15_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a  two string string");
        String case1 = scan.nextLine();
        String case2 = scan.nextLine();

        int num1 = case1.length();
        int num2 = case2.length();

        if(num1>num2){
            System.out.println(case1);
        }else if ( num1==num2){
            System.out.println("Equal");
        }else {
            System.out.println(case2);
        }



        scan.close();






    }
}
