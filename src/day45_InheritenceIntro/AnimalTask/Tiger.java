package day45_InheritenceIntro.AnimalTask;

public class Tiger extends Animal{

    public Tiger(String name, String breed, char gender, String sie, int age, String color) {
        super(name, breed, gender, sie, age, color);
    }
    public void roar(){
        System.out.println(name+" is roaring");
    }
}
