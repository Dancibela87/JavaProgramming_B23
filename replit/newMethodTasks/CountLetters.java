package newMethodTasks;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {

        String letters = "";
        for (int i = 0; i < str.length(); i++) {

            if (!letters.contains("" + str.charAt(i))) {
                letters += str.charAt(i);
            }
        }
        String result = "";
        for (int j = 0; j < letters.length(); j++) {
            char ch = letters.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i))
                    count++;
            }
                result += count + "" + ch;
            }

        return result;
    }

    }