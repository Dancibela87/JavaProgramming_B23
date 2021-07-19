package day15_String;

public class ReplaceMethod {
    public static void main(String[] args) {
        
        String sen ="Python is an easy language";
        String sen1 = sen.replace("Python","Java");
        
        System.out.println("sen1 = " + sen1);
        
        String sen4  = "C# is a programming language, i like learning C#, C# is the best.";
        String sen5 = sen4.replace("C#","Java");
        System.out.println("sen5 = " + sen5);

       String n ="Dog is friendly, dog is loyal, I love Dogs.";
       String n1 = n.replace("Dog","Cat");
       String n2 = n.replaceFirst("Dog", "Cat");
       String n3 =n.replace("dog","cat");//check this

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        
        
        
        
    }
}
