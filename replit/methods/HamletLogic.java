package methods;

import java.util.Scanner;

public class HamletLogic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
         boolean result;
         if(toBe == false && notToBe == false){
             result =false;
         }else{
            result= true;
         }

     return result;

    }




}
/*
The famous quote is "to be or not to be" is a classic example of boolean logic.

the hamletQuote method only returns true if one or both of the boolean parameters is true.
 */