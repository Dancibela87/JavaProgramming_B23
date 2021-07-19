package day23_Arrays;

public class NestedLoopTwo {
    public static void main(String[] args) {


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println("______________________________");

        for (int j = 1; j <= 8; j++) {

            for (int i = 1; i <=j ; i++) {
                System.out.print("*");

            }
            System.out.println();

        }








    }
}
