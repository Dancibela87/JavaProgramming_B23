package day13_ScannerContinued;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter building number");
        int buildingNumber =scan.nextInt();

        scan.nextLine();

        System.out.println("Enter street name: ");
        String street = scan.nextLine();

        System.out.println("Enter city name: ");
        String city = scan.nextLine();

        System.out.println("Enter state:");
        String state = scan.next();


        System.out.println("Enter zip code:");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter full name: ");
        String fullName = scan.nextLine();

        String shipping = fullName+"\n"+buildingNumber+" "+street+"\n"+city+
                ", "+state+" "+zipCode;
        System.out.println("shipping = " + shipping);








    }
}
/*
building number int
street address nextLine
city name nextLine
state next
zip code next
full name nextLine

print:Shipping info


 */