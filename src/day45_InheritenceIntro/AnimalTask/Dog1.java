package day45_InheritenceIntro.AnimalTask;

public class Dog1 extends Animal{

    public Dog1(String name, String breed, char gender, String size, int age, String color){
        super(name, breed, gender, size, age, color);

    }

    public void bark(){
        System.out.println(name+" is barking");
    }

}
