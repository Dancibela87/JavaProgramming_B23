package day23_Arrays;

import day12_Scanner.ScannerIntro;

import java.util.Scanner;

public class DaysInWeekArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] days ={"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};

        int n = new Scanner(System.in).nextInt();

        if(n>=1 && n<=7){
            System.out.println(days[n-1]);
        }





scan.close();

    }
}
