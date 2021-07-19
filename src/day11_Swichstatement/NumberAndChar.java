package day11_Swichstatement;

public class NumberAndChar {
    public static void main(String[] args) {

        double n1 = 200;
        double n2 = 100;
        double result = 0;
        char operator ='+';


        switch (operator){
            case '-':
                result=n1-n2;
                break;
            case '+' :
                result=n1+n2;
                break;
            case '*':
                result=n1*n2;
                break;
            case '/':
               result = n1/n2;

            default:
                System.out.println("Not applicable");
                break;



        }

        System.out.println(result);






    }
}
/*
4. Given two double variables n1, n2 and a char variable named operator.
use switch statement to calculate the result of n1 & n2
based on the given operator
        Valid operators are: -, +, *, /
 */