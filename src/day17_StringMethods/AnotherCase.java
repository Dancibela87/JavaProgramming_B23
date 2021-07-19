package day17_StringMethods;

public class AnotherCase {
    public static void main(String[] args) {
        String word = "Lillly";

        boolean endsWith = word.endsWith("ly");

        if(endsWith){
            System.out.println("really?");
        }else{
            System.out.println("Never mind");
        }




    }
}
/*
 ask the user to enter a word.
        if the word ends with "ly", print "really???" ,
         otherwise, print "never mind"
 */