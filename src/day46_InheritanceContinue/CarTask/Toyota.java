package day46_InheritanceContinue.CarTask;

public class Toyota extends Car{

   static boolean isReliable;//or it could be initialized here
   static {
       isReliable = true;
   }
    public Toyota( String model, int year, double price, String color, long miles) {
        super("Toyota", model, year, price, color, miles);
    }

}
