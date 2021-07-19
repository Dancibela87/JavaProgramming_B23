package day21_LoopsAgain;

public class RetriveDigitsLettersCharacters {
    public static void main(String[] args) {

        String word =" mn@#123Ab!";
        String letters ="";
        String digits ="";
        String specialcharacter ="";

        for (int i = 0; i <=word.length()-1 ; i++) {

            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z' || word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                letters += word.charAt(i);
            } else if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                digits += word.charAt(i);
            } else {
                specialcharacter += word.charAt(i);
            }
        }


            System.out.println("letters: " + letters);
            System.out.println("digits: " + digits);
            System.out.println("special characters: " + specialcharacter);




        }
}
/*
 write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */