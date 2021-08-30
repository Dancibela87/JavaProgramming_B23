package day46_InheritanceContinue.CarTask;

public class Car {
    public String brand;
    public String model;
    public final int year;
    public double price;
    public String color;
    public long miles;

    public Car(String brand, String model, int year, double price, String color, long miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start(){
        System.out.println("Insert key");
        System.out.println("Twist it to ignition");
    }
    public void drive(){
        System.out.println(brand+" "+model+" is ready to drive");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
