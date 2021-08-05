package day37_ClassAndObjects;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // that is how we create object of the dog class
        dog1.name = "Bak";
        dog1.breed = "Pit Bull";
        dog1.size = "large";
        dog1.age = 5;
        dog1.color = "light brown";
        dog1.gender = "male";

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.gender);

        System.out.println("________________________________________");
        Dog dog2 = new Dog();
        dog2.setDogInfo("Bak",5,"male","large", "light brown","Pit Bull");

        //you can make as many copies as you want
        dog1.bark();
        dog1.eat("dog food");
        dog1.drink("water");
        dog1.play();

        dog2.getInfo();

        System.out.println("______________________________________________");

        Dog[] dogs = {dog1, dog2};
        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.addAll(Arrays.asList(dog1, dog2));




    }

}
