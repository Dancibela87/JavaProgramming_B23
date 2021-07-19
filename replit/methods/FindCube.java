package methods;

import java.util.Scanner;

public class FindCube {
    public static void main(String[] args) {
        cube();

    }
    public static void cube(){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int result = num1*num1*num1;
        System.out.println(result);

        scan.close();
    }

}
/*
Create a method called cube.
It is a void method with no arguments.
 Write all required code inside this method in order to read a number
  from the console and then prints the cubed value of that number:


 */