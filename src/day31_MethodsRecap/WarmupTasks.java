package day31_MethodsRecap;

import day24_ArraysContinued.AnagramInterviewTask;

import java.util.Arrays;

public class WarmupTasks {

    public static void main(String[] args) {

        String word = "MMMMMMMMHHJJJJJJJJJJJUUUUUUUUUUUUYYYYYYYYY";
        System.out.println( removeDuplicates(word));  //all return methods are datas
        String r = removeDuplicates(word);
        System.out.println(r);

        System.out.println("__________________________________");

        System.out.println(isAnagram("earth", "heart"));

        System.out.println("___________________________________");

        int n1 = frequencyOfCharInString("MMMMMMMMmmn",'M');
        System.out.println(n1);

        System.out.println("___________________________________");

        String s = "aaaaaaaaaaabbbbrrrrrrrrrrt";
        System.out.println(uniqueChar(s));

        System.out.println("___________________________________");

        String s3 = "AAABBCCCC";
        String result ="";

        for(char each : removeDuplicates(s3).toCharArray()){
          result += "" + each + frequencyOfCharInString(s3,each);
        }
        System.out.println(result);

        String s4 = "KKKKKJJJJJJGGGG";
        String result2 = frequencyOfChars(s4);
        System.out.println(result2);




    }

    //remove duplicates from string, returns string
    public static String removeDuplicates(String str){
        String result = "";
        /*for (int i = 0; i < str.length(); i++) {
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }

        }*/

        for (char ch: str.toCharArray()){
            if(result.indexOf(ch) < 0){
               result +=  ch;
            }
        }

        return result;
    }

    //Anagram taks
    public static boolean isAnagram(String str1,String str2){
        boolean isAnagram;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    //returns the frequency of given character from given string, returns int
    public static int frequencyOfCharInString(String str, char ch){
        int frequency = 0;
      for(char each :str.toCharArray()){
          if( each==ch){
              frequency++;
          }
      }
        return frequency;
    }

    //uniques characters
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











}
