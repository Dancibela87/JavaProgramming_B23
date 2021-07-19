package day05_ArithmeticOperators;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 100;//verify if it is even
        boolean isEven = number%2 ==0;//if reminder of number divided by two is 0, than it is even number
        boolean isOdd = number%2 > 0;//if it is greater than zero than it is odd


        System.out.println(number +" is even number: "+ isEven);
        System.out.println(number +" is odd number: "+ isOdd);
    }
}
