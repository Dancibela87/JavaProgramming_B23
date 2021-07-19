package newMethodTasks;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));

        in.close();
    }

    public static String uniqueChars(String str) {
        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!uniqueChars.contains(""+each)){
                uniqueChars+=each;
            }

        }
        return uniqueChars;
    }

}
/*
uniqueChars is a method that will accept any String and
return the String with out any dupclicate characters


 */