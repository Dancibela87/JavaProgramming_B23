package arrayListTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list){
        ArrayList<Boolean> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.addAll(list);

        return list2;



    }
}

