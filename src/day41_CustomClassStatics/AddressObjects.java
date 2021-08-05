package day41_CustomClassStatics;

import arrayListTasks.Add;

import java.util.Scanner;

public class AddressObjects {
    public static void main(String[] args) {

        Address address = new Address();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number");
        String  building = scan.next();

        scan.nextLine();

        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city =  scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        address.setInfo(building,street,city,state,zipCode);
        System.out.println(address);





    }
}