package day07_ShortHand_Relational;

import javax.lang.model.SourceVersion;

public class SwipeTwoVariables {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = a;//use third variable to swipe value.
        //This was interview task.

        a=b;//15
        b=c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);





        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }
}
/*
1. write a program that can swipe two variables' value by using a temporary variable
    ex:
        if a= 10, b=15

    output:
        a = 15
        b = 10
 */