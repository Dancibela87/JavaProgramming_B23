package day37_ClassAndObjects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalDateTask {
    public static void main(String[] args) {
        LocalDate[] dates = {LocalDate.now(),LocalDate.now().minusDays(700),LocalDate.of(2018,9,23),
                              LocalDate.now().minusYears(8),LocalDate.now().plusWeeks(6), LocalDate.now().minusYears(9),
                               LocalDate.of(2016,5,26)};
        ArrayList<LocalDate> list = new ArrayList<>(Arrays.asList(dates));
        list.removeIf(p-> p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println("list = " + list);
        





    }
}
