package day37_ClassAndObjects;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        /*
        1. create an Array of String called jobTitles
        2. write a program that only keeps the jobTitles that are: SDET and QA
         */

        ArrayList<String > jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("SDET", "doctor", "actor", "QA", "dentist", "server"));
        jobTitles.retainAll(Arrays.asList("SDET", "QA"));

        System.out.println( jobTitles);



    }
}
