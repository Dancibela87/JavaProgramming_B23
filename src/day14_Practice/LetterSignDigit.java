package day14_Practice;

public class LetterSignDigit {
    public static void main(String[] args) {

        char ch = '5';

        boolean isDigit = ch>='0' && ch<='9';
        boolean isLetter = (ch>='A' && ch<='Z') || (ch>='a' && ch<='z');

       // boolean isSign = !isDigit && !isLetter;

        String result = (isDigit)? ch + " is digit":(isLetter)? ch +" is letter" :
                ch+ " is special character";

        System.out.println( result);


       /* if(isDigit){
            result = ch + " is digit";
        }else if(isLetter){
            result = ch+ " is letter";
        }else {
            result = ch+ " is special character";
        }
        System.out.println(result);*/













    }
}
/*
given char variable decide if the character is letter,
digit or specialChar
 */