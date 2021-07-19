package day16_StringMethodsContinued;

public class EqualsMethods {
    public static void main(String[] args) {

        String str1 = "Cat";//in string pool
        String str2 = new String("Cat");//it is in the heep/
        String str4= "Cat";
        String str3 = new String("Cat");


        System.out.println(str1==str4);  //true
        System.out.println(str1==str2);   //false
        System.out.println(str2.equals(str3));  ///true
        System.out.println(str2.equals(str1));//true
        System.out.println(str2==str3);  //false
        System.out.println(str1.equals(str4)); //true






    }
}
