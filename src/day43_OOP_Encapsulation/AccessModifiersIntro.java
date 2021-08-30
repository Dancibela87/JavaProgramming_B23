package day43_OOP_Encapsulation;

public class AccessModifiersIntro {

    public static int publicVariable =100;
    protected static int protectedVariable =1000;
    static int defaultVariable = 300;
    private static int privateVariable =200;

    public static void main(String[] args) {
        System.out.println(privateVariable);
        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(protectedVariable);

        //all of them are reachable in the same class
    }


}
