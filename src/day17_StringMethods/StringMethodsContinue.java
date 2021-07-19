package day17_StringMethods;

public class StringMethodsContinue {
    public static void main(String[] args) {

                  //contain()

   String sentence = "My favorite programming languages are Java, C#, Java Script" ;

   boolean hasPython = sentence.contains("Python");
   boolean hasJava = sentence.contains("Java");
   boolean hasjava2 = sentence.toLowerCase().contains("java");

        System.out.println("hasPython = " + hasPython);
        System.out.println("hasJava = " + hasJava);
        

              //startsWith();   endsWith();
        
   String sentence2 = "Cybertek school is the best";
   boolean  startsWithCybertek = sentence2.startsWith("Cybertek");

        System.out.println("startsWithCybertek = " + startsWithCybertek);

   boolean endsWithBest = sentence2.endsWith("best");

        System.out.println("endsWithBest = " + endsWithBest);


   //They return boolean. We can use them just when we have something to compare










    }
}
