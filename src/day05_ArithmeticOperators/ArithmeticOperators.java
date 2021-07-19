package day05_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {


        System.out.println(25/2);//12 both are int
        System.out.println(25.0/2);//12.5, one double
        System.out.println(25/2.0);
        System.out.println(25d/2);

       // System.out.println(10/0);-exception
        System.out.println("Hello");//can not execute code fragment after exception

        int a = 100/3; //33.3333- in math
        System.out.println("a = " + a);

        double b = 100/3; //you will get 33 cause both are integer numbers
        //b = 33 ==>33.0
        System.out.println("b = " + b);

        double c = 100.0/3;
        System.out.println("c = " + c);

        System.out.println("___________");

        int n1 = 100;
        int n2 = 40;
        System.out.println(n1%n2);





    }
}
