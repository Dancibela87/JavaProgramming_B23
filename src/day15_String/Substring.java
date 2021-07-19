package day15_String;

public class Substring {
    public static void main(String[] args) {

       String sentence = "Java Programming Language";
       String name = sentence.substring(0,3+1);   //or you can put four
       // it does not include the least index

        System.out.println("name = " + name);
        
        String s2 = "Cybertek school";
        String name2  =s2.substring(0,8);//(0,7+1) it gives the same result
        String name3 = s2.substring(9);//by default it goes till the end

        System.out.println("s2 = " + s2);

        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + name3);

        System.out.println("______________________________");
        
        String sen2 = "Java is a programming language";
        String name4 = sen2.substring(10);

        System.out.println("name4 = " + name4);
        
        String name5 =  sen2.substring(10,21);
        System.out.println("name5 = " + name5);










    }
}
