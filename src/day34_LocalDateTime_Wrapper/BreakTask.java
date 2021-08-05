package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BreakTask {
    private int i;

    public static void main(String[] args) {

        String[] names = {"Danka", "Petar", "Kaca", "Milunka", "Maja"};
        LocalDate[] DoB = {LocalDate.of(1987, 7, 26),
                LocalDate.of(1978, 6, 17),
                LocalDate.of(1988, 9, 20),
                LocalDate.of(1961, 9, 6),
                LocalDate.of(1987, 11, 11)};

        LocalDate youngest=DoB[0];
        int index=0;
        for (int i = 0; i < names.length; i++) {
            if(DoB[i].isAfter(youngest)){
                youngest=DoB[i];
                index=i;
            }
            if(DoB[i].isLeapYear()){
                System.out.println(names[i]);
            }
        }
        System.out.println(names[index]+" is the youngest person and born at "+youngest);

        System.out.println("___________________________________________________________________");

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i] +" was born on "+ DoB[i].format(DF));

        }





    }

}






/*
  1. create string array to have 5 of your classmate's names

    2. create an array that contains their DofB

    3. find out who is the youngest person

    4. find out who was born on leap year
 */