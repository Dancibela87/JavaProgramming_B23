package day28_Methods;

public class CustomMethodIntro {


    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Danka");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

          // this way you can call this through the class, cause we have static
        CustomMethodIntro.printHello5Times();

    }

    public static void printHello5Times(){ // it has to be inside the class, but not in main method
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");

        }
        //methods are independent, there can not be inside each other
    }




}
