package day37_ClassAndObjects;

public class CatPark {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Gaga", "siamsaka", 5,"small", "white", "female");
        cat1.getCatInfo();

        cat1.food("meat");
        cat1.drinks("milk");
        cat1.jump();
        cat1.play();






    }
}
