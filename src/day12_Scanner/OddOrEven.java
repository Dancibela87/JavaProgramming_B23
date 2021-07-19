package day12_Scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = input.nextInt();
        

        System.out.println((num%2!=0)? "Odd" : "Even");
        System.out.println( ( num > 0)?"Positive":(num<0)? "Negative":"Zero");
                

                
                
                
                
    }
}
