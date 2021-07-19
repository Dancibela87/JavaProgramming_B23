package utilities;

import java.util.Arrays;

public class StringUtility {

    //create reversed string from given one
    public static String reverse(String sen) {
        String result = "";
        for (int i = sen.length() - 1; i >= 0; i--) {
            result += sen.charAt(i);

        }
        System.out.println(result);

        return result;
    }

    //check if given string is palindrome,returns boolean
    public static boolean isPalindrome(String str) {
        String str2 = reverse(str);
        boolean isPalindrome = str.equalsIgnoreCase(str2);

        return isPalindrome;
    }

    //remove duplicate characters from string,returns string
    public static String removeDuplicates(String str) {
        String result = "";
        /*for (int i = 0; i < str.length(); i++) {
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }

        }*/

        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) < 0) {
                result += ch;
            }
        }

        return result;
    }

    //check if string is anagram,returns boolean
    public static boolean isAnagram(String str1, String str2) {
        boolean isAnagram;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    //returns the frequency of given char from given string, returns int
    public static int frequencyOfCharInString(String str, char ch){
        int frequency = 0;
        for(char each :str.toCharArray()){
            if( each==ch){
                frequency++;
            }
        }
        return frequency;
    }

    //uniques characters, returns string
    public static String uniqueChar(String str){
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int frequency = frequencyOfCharInString(str, each);
            if( frequency == 1){
                unique+=each;
            }

        }
        return unique;

    }

    // returns the frequency of chars, returns string
    public static String frequencyOfChars(String str){
        String result ="";

        for(char each : removeDuplicates(str).toCharArray()){
            result += "" + each + frequencyOfCharInString(str,each);
        }

        return result;

    }

    //frequency of word from sentence, ignores cases, returns int
    public static int frequencyOfWord(String sen, String word){
        int count = 0;
        sen = sen.toLowerCase();
        word = word.toLowerCase();

        while(sen.contains(word)){

            if (sen.contains(word)) {
                sen = sen.replaceFirst(word, "");
                count++;
            }
        }

        return count;

    }








}


