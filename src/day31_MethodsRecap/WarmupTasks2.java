package day31_MethodsRecap;

import java.util.Locale;

public class WarmupTasks2 {
    public static void main(String[] args) {
        String sen = "Java java JaVA";
        String word = "java";

        int count = 0;
        sen = sen.toLowerCase();
        word = word.toLowerCase();

       while(sen.contains(word)){

            if (sen.contains(word)) {
                sen = sen.replaceFirst(word, "");
                count++;
            }
        }
        System.out.println(count);

       String str  = "Cybertek CYBERTEK CybeRtek";
       String word1 = "CYBERTEK";

        int res = frequencyOfWord(str,word1);
        System.out.println(res);

    }

    //frequency of word from sen, ignores cases
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

    //merge two integar arrays









}
