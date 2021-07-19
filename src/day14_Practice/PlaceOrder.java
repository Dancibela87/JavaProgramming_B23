package day14_Practice;

import jdk.nashorn.internal.ir.JumpStatement;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product name:");
        String productName = scan.nextLine();

        System.out.println("Enter the price:");
        double price = scan.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = scan.nextInt();

        System.out.println("Enter first name:");
        String name = scan.next();

        scan.close();//after this line you can use scanner. It is closed.
                   //it want print if you use scanner after this. it is not mandatory, but recommended

        double totalPrice = quantity*price;

        System.out.println(name+" your order for "+quantity+" "+productName+" has been placed."+"\n"+
        " Your total is "+totalPrice);






scan.close();


    }
}
/*
1. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places.
                        Your total is 7.5.

 */