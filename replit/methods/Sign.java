package methods;

import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);


   inp.close();
    }

    public static void sign(int n){
        if(n<0){
            System.out.println("negative");
        }else if(n>0){
            System.out.println("positive");
        }else{
            System.out.println("zero");
        }

    }
}
/*
Given a method sign write the code so that its takes a
 number argument and tells you if its positive, negative or zero.
 */