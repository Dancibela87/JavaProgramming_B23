package day07_ShortHand_Relational;

public class RelationalOperators {
    public static void main(String[] args) {
        //used a lot with boolean

        //>,>=
        System.out.println(10>11);//false
        System.out.println(10>=10);// ;and logic not possible here.

       //<,<=
        System.out.println(100<400);//true
        System.out.println(100<=100);//true
        System.out.println(100<=102);//ture
        System.out.println(200<100);//false

        //== it means it is equal. Only and logic will apply hrere.

        System.out.println(10==10);//true
        System.out.println(10==11);//false

        //!=is not equal// and logic only
        System.out.println(5!=6);//true
        System.out.println(5==6);//false

        System.out.println('a'=='A');//false, so it could be used with characters
        System.out.println('a'!='A');//true

        System.out.println("Java"=="java");//false
        //==,!= can be used to compare text as well


    }
}
