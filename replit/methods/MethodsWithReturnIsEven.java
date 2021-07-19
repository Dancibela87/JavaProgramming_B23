package methods;

import java.util.Scanner;

public class MethodsWithReturnIsEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }



    public static boolean isEven(int n) {
        boolean isTrue;
        if(n%2==0){
            isTrue =true;
        }else{
            isTrue=false;
        }
        return isTrue;
    }
}
/*
isEven accepts a number and checks if it is even.
 If the given number is even return true, otherwise return false.

Examples:
 */