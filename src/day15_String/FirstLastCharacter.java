package day15_String;

import java.util.Scanner;

public class FirstLastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sequence");
        String sequence = scan.nextLine();

       char first = sequence.charAt(0);
        int total = sequence.length()-1;
        char last = sequence.charAt(total);

        System.out.println(first);
        System.out.println(last);



        scan.close();












    }
}
