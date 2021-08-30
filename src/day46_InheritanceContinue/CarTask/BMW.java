package day46_InheritanceContinue.CarTask;

public class BMW extends Car{

    public static boolean isLuxuryBrand = true;
    public BMW( String model, int year, double price, String color, long miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void race(){
        System.out.println(brand+" "+model+" is ricing car");
    }

}
