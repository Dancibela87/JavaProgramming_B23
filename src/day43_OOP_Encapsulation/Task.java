package day43_OOP_Encapsulation;

public class Task {

    public static void main(String[] args) {

        System.out.println(AccessModifiersIntro.publicVariable);
        System.out.println(AccessModifiersIntro.defaultVariable);
        System.out.println(AccessModifiersIntro.protectedVariable);
        //private wont be reachable through another class, just whitin the same class

        System.out.println("______________________________________________________________________________");

        EncapsulationIntro obj = new EncapsulationIntro();;

        System.out.println(obj.getPassword());
        obj.setPassword("12345");
        obj.setUserName("Dancibela");
        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());


       /* System.out.println(obj.password);
        System.out.println(obj.userName);

        obj.userName = "H";
        obj.password = "123";              //if it is public you can use it and change it any time.
        System.out.println(obj.userName);
        System.out.println(obj.password);*/








    }


}
