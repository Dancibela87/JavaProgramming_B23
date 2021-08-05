package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class Birthday {
    public static void main(String[] args) {

        isBirthday(1987,7,26);

    }

    public static void isBirthday( int year, int month, int date){
        LocalDate DOB = LocalDate.of(year,month,date);
        LocalDate today = LocalDate.now();
        int age  = today.getYear() - DOB.getYear();

        if(DOB.getMonthValue() == today.getMonthValue() && DOB.getDayOfMonth() == today.getDayOfMonth()){
            System.out.println("Happy birthday");
            System.out.println("Today you are " + age +" years old.");
        }else{
            System.out.println("Today is not your birthday");
        }

    }
}
