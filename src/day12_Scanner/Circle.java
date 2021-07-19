package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius of circle");

        double radius = input.nextDouble();

        double area = 3.14 * radius*radius;

        System.out.println("Circle area is: "+ area);





    }
}
