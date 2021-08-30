package day45_InheritenceIntro.AnimalTask;

public class Zoo{
    public static void main(String[] args) {

        Dog1 dog = new Dog1("Bak","pit bull",'M',"Large",5,"Brown-yellow");
        dog.bark();
        dog.eat("dog food");
        dog.drink("Water");
        dog.sleep();

        Cat cat = new Cat("Gaga","cat",'F',"small",4,"black-white");
        cat.meow();
        cat.eat("Cat food");
        cat.drink("milk");
        cat.sleep();

        Tiger tiger = new Tiger("Uros","cat",'M',"large",8,"black-brown");
        tiger.roar();
        tiger.eat("meat");
        tiger.drink("water");
        tiger.sleep();
    }
}
