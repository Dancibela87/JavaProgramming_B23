package day20_LoopsContinued;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String sen = "cat cat dog";

        int numberOfCats =0;
        int numberOfDogs =0;

        for (int i = 0; i < sen.length()-3; i++) {
            String each = sen.substring(i, i + 3);
            if (each.equalsIgnoreCase("cat")) {
                numberOfCats++;
            }
            if(each.equalsIgnoreCase("dog")){
                numberOfDogs++;
            }
        }
        System.out.println("numberOfCats = " + numberOfCats);
        System.out.println("numberOfDogs = " + numberOfDogs);


scan.close();




    }
}
/*
 write a program to print true if the string "cat" and "dog"
 appear the same number of times in the given sentence

        Ex:
            sentence = "cat dog dog cat"

            output:
                true
 */