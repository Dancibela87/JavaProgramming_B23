package utilities;

public class NumbersUtilities {

    //check if the number is odd, return boolean
    public static boolean isOdd(int num){
        boolean isOdd = true;
         if(num%2!=0){
             isOdd= true;
         }else if( num%2==0){
             isOdd=false;
         }

         return isOdd;

    }

    //check ig number is even, return boolean
    public static boolean isEven(int num){

        boolean isEven = (num%2==0)? true: false;

        return isEven;
    }

    //subtract two numbers, return int
    public static int subtractTwoNumbers(int num1, int num2){
        int subtraction = num1 - num2;
        return subtraction;
    }

    //return max number between two numbers
    public static int maxNum(int num1, int num2){
        int max = (num1>num2)? num1 : num2;
        return max;

    }

    //return min number between two numbers
    public static int minNum(int num1, int num2){
        int min = (num1<num2) ? num1: num2;
        return min;
    }

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

