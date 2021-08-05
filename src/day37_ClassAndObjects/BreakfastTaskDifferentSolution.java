package day37_ClassAndObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BreakfastTaskDifferentSolution {
    public static void main(String[] args) {

        String [] names = {"Danka","Petar","Bojan","Nina","Marija"};
        ArrayList<String > students = new ArrayList<>();
        students.addAll(Arrays.asList(names));
        Collections.swap(students,0,students.size()-1);
        System.out.println(students);

    }
}
