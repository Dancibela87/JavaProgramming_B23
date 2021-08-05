package day37_ClassAndObjects;

public class Dog {
    //we decide what attributes we will include
    //this class is not use for running, just as template
    public String name; //you have to do pub;ick to be able to use it outside this class
    public String breed;
    public int age;
    public String size;
    public String color;
    public String gender;

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }
    public void bark(){
        System.out.println(name +" is barking");
    }
    public void play(){
        System.out.println(name + " is playing");
    }
    public void setDogInfo(String dogName, int dogAge, String dogGender, String dogSize, String dogColor, String dogBreed){

        name = dogName;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
        breed = dogBreed;


    }
    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("age = " + age);
        System.out.println("size = " + size);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
    }






}
