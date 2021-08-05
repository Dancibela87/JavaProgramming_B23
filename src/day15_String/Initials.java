package day15_String;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        char name = scan.next().charAt(0);


        System.out.println("Enter your last name:");
        char last = scan.next().charAt(0);
        
        String initials = name +"."+last;
        System.out.println("initials = " + initials);



      /*  char n = name.charAt(0);
        char l = last.charAt(0);

        String initial = n +"."+l;*/













    }
}
/*
enter first name
last name
print out initials.
 */