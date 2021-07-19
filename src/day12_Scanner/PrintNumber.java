package day12_Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        //divisible by 3 =3,6,9
        //divisible by 5 = 5,10
        int num = 9;
        String result = "";

        switch (num){


            case 3:
            case 6:
            case 9:
                result= "Fizz";
                break;


            case 5:
            case 10:
                result = "Buzz";
                break;

            case 7:
                result = "Seven";
                break;
            case 8:
               result = "eight";
                break;
            case 1:
               result = "One";
                break;
            case 2:
               result = "Two";
                break;
            case 4:
                result = "Four";//put them in order
                break;
            default:
                result = "Invalid number";
                //you can put break or not at the end of default



        }

        System.out.println(result);






    }
}
/*
2. write a program that can print any number between 1 ~ 10,
but for number which is a multiple of 3 print "Fizz"
instead of the number and for number which is a multiple of 5,
 print "Buzz" instead of the number,
 and for number which is a multiple of both 3 and 5 both print "FizBuzz"
 instead of the number.

                  MUST use switch statement
 */