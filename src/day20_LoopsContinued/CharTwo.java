package day20_LoopsContinued;

import java.util.Scanner;

public class CharTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inhabitants = scan.nextInt();

        int finalNum =inhabitants;

        for (int i = 0; i <=finalNum ; i++) {
            if (inhabitants == 0) {

                System.out.println("---- EXTINCT ----");
                break;
            }else{
                System.out.println("Day "+i+" ["+ inhabitants + "]");
                inhabitants/=2;
                if(inhabitants==0){
                    System.out.println("---- EXTINCT ----");
                    break;
                }
            }

        }










    }
}
