package newMethodTasks;

import java.util.Scanner;

public class RemoveFirstChar {
    public static String removeFirst(String target) {

      String removed = target.substring(1);
      return removed;

    }


    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }


}
/*
The method accepts a string and returns a string without the first character
 */