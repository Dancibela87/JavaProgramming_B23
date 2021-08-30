package day46_InheritanceContinue.CarTask;

public class CarShop {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020,45000,"black",20000);
        toyota.start();

        System.out.println("_____________________________________________");

        Tesla tesla = new Tesla("S model",2021,120000,"White",25000);
        tesla.start();

        System.out.println("______________________________________________");

        BMW bmw = new BMW("X6",2018,10000,"red",35000);
        bmw.start();

    }
}
