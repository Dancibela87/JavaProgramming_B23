package day37_ClassAndObjects;

public class Cat {
    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;
    public String gender;

    public void food(String food){
        System.out.println(name + " is eating " + food );
    }
    public void drinks(String drink){
        System.out.println(name + " is drinking "+drink);
    }
    public void play(){
        System.out.println(name + " is playing");
    }
    public void jump(){
        System.out.println(name + " is jumping");
    }
    public void setCatInfo(String catName, String catBreed, int catAge, String catSize, String catColor, String catGender){
        name = catName;
        breed = catBreed;
        age = catAge;
        size = catSize;
        color = catColor;
        gender = catGender;



    }
    public void getCatInfo(){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("age = " + age);
        System.out.println("size = " + size);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
    }
}

