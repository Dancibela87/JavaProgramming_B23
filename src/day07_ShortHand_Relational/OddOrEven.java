package day07_ShortHand_Relational;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 101;

        boolean isEven = num%2==0;
        boolean isOdd = num%2 !=0; //boolean isOdd = isEven==false;
                                   // that is another way
                                   // or = num% > 0

        System.out.println(num + " is even: "+ isEven);
        System.out.println(num + " is odd: "+ isOdd);








    }
}
/*
odd or even
 */
