package day19_LoopsIntroForLoop;

public class EnglishAlphabets {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i+" ");
        }

        //if you use numbers, you put (char) before variable name in print statement
        System.out.println();
        System.out.println("__________________________");

        for (char i = 'z'; i >= 'a' ; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("_____________________________________________");
        //print characters from 1000-30000 in sam eline separated by space

        for (char i = 1000; i <= 30000; i++) {
            System.out.print(i +" ");
        }










    }
}
