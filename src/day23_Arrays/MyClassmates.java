package day23_Arrays;

import java.util.Scanner;

public class MyClassmates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // when you know the content
        String[] names1 = {"Danka", "Maja", "Raso", "Pero", "Srdjo"};
        System.out.println("Size: "+ names1.length);
                                     //how to get length of array, it is not method

        for (int i =0; i <= names1.length-1 ;i++){
            System.out.println(names1[i]);
        }

            System.out.println("____________________________________");

        //when you do not know the content but you know the size
        String[] names =new String[5];
        System.out.println("Size: " + names.length);

        names[0]="Danka";  // this is how you store elements
        names[1]="Maja";
        names[2]="Raso";
        names[3]="Pero";
        names[4]="Srdjo";


        for (int j = 0; j <= names.length-1; j++) {//null will be printed, cause it is not known string object
            System.out.println(names[j]);
        }









scan.close();
    }
}
