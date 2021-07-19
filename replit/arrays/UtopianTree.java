package arrays;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int size = 0;
        int growth= 0;
        int year;
        for (year = 1; year <= 10; year++) {

            if (year > 0 && year < 3) {
                growth = 1;
                size++;
            }
            if (year == 3) {
                growth = 1;
                size++;
                System.out.println("year "+year +" - "+"growth "+growth+" cm");
                System.out.println("tree size: "+size+"cm");
            }
            if (year > 3 && year <= 10) {
                growth = 2;
                size += growth;
            }
        }







    }
}
/*
The Utopian Tree grows exactly 1 cm for the first three years,
 and after that it grows by 2 cm every year.
 Show 10 years of growth of the Utopian Tree.
 */