package arrayListTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class remove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        // Write your code below
        list.remove(0);
        list.remove(0);






        // Do not touch below
        System.out.println(list);

    }

}
/*
Finish code so that it will remove the first two elements in the given ArrayList of Integers (be careful, this is a little tricky!)

Example: Say you had an ArrayList called nums with values (6,2,3,1,9,2,5).
 */