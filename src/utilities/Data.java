package utilities;

import day43_OOP_Encapsulation.AccessModifiersIntro;

public class Data {

    public String str1, str2;
    public void method1(){}
    public void method2(){}

    public static String str3, str4;
    public static void method3(){}
    public static void method4(){}

    public static void main(String[] args) {
        System.out.println(AccessModifiersIntro.publicVariable);
        //just public access modifier would be reachable through another package
    }
}
