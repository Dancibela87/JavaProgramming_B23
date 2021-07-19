package day24_ArraysContinued;

import java.util.Arrays;

public class FirstCharacters {
    public static void main(String[] args) {

        String[] names = new String[10];
        names[0]="Danka";
        names[1]="Petar";
        names[2]="Milos";
        names[3]="Srdjan";
        names[4]="Marija";
        names[5]="Raso";
        names[6]="Dusko";
        names[7]="Kaca";
        names[8]="Bojana";
        names[9]="Nina";

        for (int i = 0; i < names.length; i++) {
            String each = names[i];
            System.out.print(names[i].substring(0,3)+" ");
        }

        //do the same task with the names in the array, already declared






    }
}
/*
 create string array, and store the names of your  class mates (10)
            print the first three characters of each name

 */