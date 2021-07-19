package day18_StringPractice;

import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {
        String sen = "Dog Cat Dog Cat";
        sen = sen.replace("Cat", "Dog");

        System.out.println("sen = " + sen);

        sen = sen.replaceFirst("Dog", "Cat");

        System.out.println("sen = " + sen);

        System.out.println("_________________________");












    }
}
