package day10_IfStatements;

public class DaysOfWeek {
    public static void main(String[] args) {

        int num=7;
        String day = "";//local variable

        if(num>=1 && num<=7)
        {
            if (num == 1) {
                day = "Monday";
            } else if (num == 2) {
                day = "Tuesday";
            } else if (num == 3) {
                day = "Wednesday";
            } else if (num == 4) {
                day = "Thursday";
            } else if (num == 5) {
                day = "Friday";
            } else if (num == 6) {
                day = "Saturday";
            } else {
                day = "Sunday";
            }
        }else{
            day="No such a day";
        }

        System.out.println("day = " + day);
        
        
        
        
        
        
        
    }
}
