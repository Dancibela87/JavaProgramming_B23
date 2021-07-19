package day07_ShortHand_Relational;

public class PosNegZero {
    public static void main(String[] args) {
        int num = -100;

        boolean isPositive = num >0;
        boolean isNegative = num<0;
        boolean isZero = isPositive == false && isNegative ==false;

        System.out.println(num + " is positive number: "+isPositive);
        System.out.println(num+ " is negative number: "+ isNegative);
        System.out.println(num + " is zero: "+isZero);

        //ih more than one is true than we have a bug.













    }
}
