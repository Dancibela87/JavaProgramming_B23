package day41_Constractor;

public class ConstructorsIntro {
    //you can have more than one, but the names have to be the same.
    //they are used for creating an object from class
    public ConstructorsIntro(){
        System.out.println("Default constructor");
    }
    public ConstructorsIntro(int a){
        System.out.println("Constructor with argument");
    }

    public static void main(String[] args) {

        new ConstructorsIntro(10); //it is executed only when you create object.It is done authomaticly
        new ConstructorsIntro();

    }





}
