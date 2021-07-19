package day15_String;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Muhtar";
        char ch = str.charAt(0);                          //CHAR

        System.out.println(ch);

        String word ="Cybertek School";
        char ch1 = word.charAt(0);

        System.out.println(ch1);

        String word2 ="Java";
        char ch2 = word2.charAt(2);
        System.out.println(ch2);

        String n = " Hello everybody, how are you?";       //LENGTH
        int totalNumberOfCharacters = n.length();

        System.out.println(totalNumberOfCharacters);

        String s1 = "Cybertek School";

        char first = s1.charAt(0);
        int lastIndex =s1.length()-1;
        char last = s1.charAt(lastIndex );



        System.out.println(last);

        System.out.println("_______________________");

        String name ="Danka";                          //CONCAT - we will not gonna use this
        String last1 ="Pavlovic";
        String fullName = name +" "+last1;
       // String fullName2 = name.concat(" ").concat(last1);

                                                       //TO UPPER CASE
        String s ="cybertek";
        s = s.toUpperCase();//it is still lower case,before you reasign it
                                // so a new object will be created
                                //CYBERTEK should be new object.
        System.out.println("s = " + s);
        System.out.println("___________________");

        String g = "JAVA";                           //TO LOWER CASE
        g = g.toLowerCase();
        System.out.println("g = " + g);

        String name1 = "danka";
        name1 = name1.toUpperCase();
        System.out.println("name1 = " + name1);

        System.out.println("________________________");
                                                     //TRIM METHOD

        String school = "    Cybertek School  ";
        school = school.trim();

        System.out.println("school = " + school);










    }
}
