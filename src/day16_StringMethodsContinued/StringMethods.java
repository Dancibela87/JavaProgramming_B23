package day16_StringMethodsContinued;

public class StringMethods {
    public static void main(String[] args) {

       String email="danka.pavlovic@gmail.com";
       email=email.replace("gmail","yahoo");

       email=email.replaceFirst("danka","bojan");

       String sent = "C is cool, C is fun";
       sent=sent.replaceFirst("C is f","Java is f");


        System.out.println(sent);
        String s= "Cat Dog Cat Dog Cat";
        s=s.replaceFirst("Cat","Dog");
 
        System.out.println("__________________");
        String sen2 = "Java is a cool language";
        int indexOfFirstA= sen2.indexOf("a");//you can make it unique
        int indexNumOfSecondA=sen2.indexOf(" a ")+1;// or ("a ")
        int indexNumOfThirdA = sen2.indexOf("a c");
        int indexNumOfForthA = sen2.indexOf("an");
       // int indexOfFifthA = sen2.indexOf("ag");
        int lastOne = sen2.lastIndexOf("a");
        
        System.out.println("indexOfFirstA = " + indexOfFirstA);
        System.out.println("indexNumOfSecondA = " + indexNumOfSecondA);
        System.out.println("indexNumOfThirdA = " + indexNumOfThirdA);
        System.out.println("indexNumOfForthA = " + indexNumOfForthA);
        System.out.println(lastOne);
        

        
        








    }






}
