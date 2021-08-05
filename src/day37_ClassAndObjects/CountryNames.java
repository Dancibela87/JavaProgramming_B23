package day37_ClassAndObjects;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {
    public static void main(String[] args) {
        ArrayList<String> countries =  new ArrayList<>();
        countries.addAll(Arrays.asList("Serbia","Montenegro", "Germany", "Italy", "Japan", "Thailand"));
        countries.removeIf(p-> p.length()>=10);
        System.out.println("countries = " + countries);
       




    }
}
/*
 1. create an Array of string called country names

 2. write a program that can remove all the country names that have length of 10 or greater
 */