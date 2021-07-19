package day17_StringMethods;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class InitialTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") +1);//otherwise it will include space,
                                                                       // it will start from space

        System.out.println(lastName);

      //now I can get initials as well



    }
}
