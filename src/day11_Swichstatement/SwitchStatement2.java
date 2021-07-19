package day11_Swichstatement;

public class SwitchStatement2 {
    public static void main(String[] args) {
        String name = "chrome";

        switch(name){

            case "chrome":
                System.out.println("Chrome Browser is selected");
                break;

            case "firefox":
                System.out.println("FireFox Browser is selected");
                break;

            case "edge":
                System.out.println("Edge Browser is selected");
                break;

            default:
                System.err.println("Invalid input");
                break;

        }












    }
}
