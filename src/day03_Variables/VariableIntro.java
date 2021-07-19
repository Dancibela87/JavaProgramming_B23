package day03_Variables;

public class VariableIntro {
    public static void main(String[] args) {

        byte myAge = 55;
        byte myBrothersAge = 45;

        System.out.print("My age is: ");
        System.out.println(myAge);

        System.out.print("My brother's Age is: ");
        System.out.println(myBrothersAge);

        //1987 it will show error if you assign it to byte
        short myBirthday = 1987;
        System.out.print("My Birth year: ");
        System.out.println(myBirthday);

        int salary = 100000;

        long number = 9999999999999l;//compiler takes it as int unless you assign L to it
        System.out.println(number);



    }





}
