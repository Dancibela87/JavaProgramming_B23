package methods;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {
    public static void main(String[] args) {
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));


    }
    public static int[] populate(int[] r) {
        for (int i = 0,j=1; i < r.length; i++,j++) {
            r[i]=j;
        }
        return r;


    }
}
/*
The populate method
accepts an empty int array
and populates it with numbers counting up.
 */