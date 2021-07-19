package day32_MethodOverloading;

public class MethodsTask1 {
    public static void main(String[] args) {

        System.out.println( sum(10,12) );
        System.out.println(sum((int)2.5,(int) 3.5));//you can return sum of decimals


    }

    public static int sumOf2Numbers(int n1, int n2){

        return n1+n2;
    }

    public static int sumOf3Numbers(int n1, int n2, int n3){
        return  n1 + n2 + n3;

    }

    public static int sumOf4Numbers(int n1, int n2, int n3, int n4){

        return n1+n2+n3+n4;

    }


    //Method overloading just group same methods under the same name. It is easier to memorize method name.
    //It is not mandatory, it is just more efficient

    //sum of 2 num
    public static int sum(int n1, int n2){
        return n1 + n2;
    }
    public static double sum(double n1, double n2){
        return n1 + n2;
    }

    //sum of 3 num
    public static double sum(double n1, double n2, double n3){
        return n1 + n2 + n3;
    }
    public static int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    //sum of 4 num
    public static double sum (double n1, double n2, double n3, double n4){
        return n1 + n2 + n3 + n4;
    }
    public static int sum(int n1, int n2, int n3, int n4){
       // return sum(n1, n2) + sum(n3, n4);
        return sum( sum( n1, n2), sum(n3, n4)); //nested method call, method inside method
       // return sum(n1,n2,n3)+n4;              //different way of doing it

    }







}
/*
 1. create a method that can find the sum of two numbers
                    method name: sumOf2Numbers

    2. create a method that can find the sum of three numbers
                    method name: sumOf3Numbers

    3. create a method that can find the sum of four numbers
                    method name: sumOf4Numbers
 */