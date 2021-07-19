package day24_ArraysContinued;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //SPLIT METHOD- it returns String array, split string by given value
        //it could be used to reverse the sentence

        String sen ="I love learning java programing language";
        String[] words = sen.split(" ");
        int numberOfWord = words.length;

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >=0; i--) {

            System.out.print(words[i]+" ");

        }
        System.out.println();

        String email = "danka@gmail.com";
        String name  =  email.split("@")[0];//the sign that we use to split it will dissapear.

        System.out.println(name);


          //ToCharArray method- returns array of chars from string

        String word = "Cybertek";
        char[] charsFromWord = word.toCharArray();
        System.out.println(Arrays.toString(charsFromWord));












    }
}
