package newMethodTasks;

import java.util.Scanner;

public class WordCount {

    public static int wordCount(String words) {
        String[] splited = words.split(" ");
        int wordCount = splited.length;
        return wordCount;




    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

}
/*
wordCount accepts String and returns how many words are in the given String
 */