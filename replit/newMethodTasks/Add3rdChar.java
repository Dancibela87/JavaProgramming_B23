package newMethodTasks;

import java.util.Scanner;

public class Add3rdChar {
    public static String at3(String target,String word){
        String at3 = "";
        for (int i = 0; i < 3; i++) {
            at3+=target.charAt(i);

        }
        at3+=word + target.substring(3);



return at3;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }


}
/*
at3 accepts two strings and returns a string.

The first string is the one that will be manipulated.
 At the 3rd char position of target you will insert the word argument.
 */