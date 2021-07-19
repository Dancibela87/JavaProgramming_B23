package day21_LoopsAgain;



public class SumOfDigitsFromString {
    public static void main(String[] args) {


        String word = "A1B2C3";
        int sum=0;


        for (int i = 0; i <= word.length()-1 ; i++) {

            char each = word.charAt(i);
            if(each >='0' &&  each<='9'){
                sum += each-'0';
            }

        }
        System.out.println("sum = " + sum);







        }
}
/*
 Write a program that can return the sum of digits from a string
             Ex:
                 input: A1B2C3

                 output:    6
 */