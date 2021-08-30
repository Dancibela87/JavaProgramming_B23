package day46_InheritanceContinue.CarTask;

public class Tesla extends Car {

    public static boolean isElectric = true;
    public Tesla( String model, int year, double price, String color, long miles) {
        super("Tesla", model, year, price, color, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" is driving by itself");
    }
    public void start(){
        System.out.println("Push the button");
    }

    @Override
    public void drive() {
        System.out.println("it goes by itself");
    }
}
