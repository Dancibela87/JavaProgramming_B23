package methods;

import java.util.Scanner;

public class SplitPersonsInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;

        inp.close();
    }
    public static void person(String info){
        String[] info2 = info.split(",");
        System.out.println("person name: " + info2[0]);
        System.out.println("last name: " + info2[1]);
        System.out.println("age: " + info2[2]);
    }

    }







/*
The method person has a string arguement with this format:
"name,last name,age". Print out the person's information

Example:

person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
hint: use the split method to split the string to a string array where there is a "," char
 */