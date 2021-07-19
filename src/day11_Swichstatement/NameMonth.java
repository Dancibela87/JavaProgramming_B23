package day11_Swichstatement;

public class NameMonth {
    public static void main(String[] args) {
        int num = 5;//or logic in switch statement

        switch(num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");

            case 2:
                System.out.println("28 days");

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");

            default:
                System.out.println("Not valid");





        }










    }
}
