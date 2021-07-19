package MethodsOverloading;

public class OverloadingMainMethod {
    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }

    //you can overload main method, but just one will run the program
}
