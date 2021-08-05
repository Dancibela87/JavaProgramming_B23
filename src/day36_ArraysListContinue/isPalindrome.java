package day36_ArraysListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class isPalindrome {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> wordsToRemove = new ArrayList<>();
        words.addAll(Arrays.asList("Anna", "Racecar", "Level", "Java", "Python", "Cybertek", "Sabas",
                "Pop", "Kayak"));

        for (int i = 0; i < words.size();i++) {
            String each = words.get(i);
            String reverse="";
            for (int j = each.length()-1; j >=0 ; j--) {
                reverse+= each.charAt(j);
            }
            boolean isPalindrome = reverse.equalsIgnoreCase(each);
            if (isPalindrome) {
                wordsToRemove.add(each);
            }
        }
        words.removeAll(wordsToRemove);
        System.out.println(words);
    }
}
