package day42_ConstructorCall;

import day43_OOP_Encapsulation.Circle;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollector {
    /*
    It is collection of garbage. It takes everything we do not need. Whenever we are going to use it,
    we do not need garbage collector, which is collector of garbage objects( the objects that we will not use).

    It is also called unreferenced object.
    So, garbage collection is collection of garbage objects from java heap and destroys it.

    there is a method called finalize ()that is called automatically. It is used implicitly,
    by garbage collector to destroy garbage objects.

    how we know that object is not used:
       * by checking the reference name, if there is one, it will be reused.
    object can become unreferenced by:
        * reassigning
        * by assigning null keyword



     */

    public static void main(String[] args) {
        int[] arr1 = new int[3]; //wew ill get 0 0 0 since the value is not assigned
        arr1 =  new int[] {1,2,3};

        //now, when we print arr1, we will get 1,2,3 since it was reassigned. And there is no way to get
        //the first arr1. It will be gone, so garbage collector will take them and destroy them.

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        list =  new ArrayList<>(Arrays.asList("D", "E", "F"));

        System.out.println(list);

        System.out.println("------------------------------------");

        Employee employee1 = new Employee("Yasin");
        Employee employee2 = new Employee("Feruza");

        employee1 = employee2; //old employee1 object will be eligible for garbage collection

        System.out.println("------------------------------------------");

        String s1 = "Napkins",
                s2 = "Paper Towels";

        s2 = s1;

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("-----------------------------------------------");

        Car car1 = new Car("Toyota", "Corolla");
        Car car2 =   new Car("BMW", "X5");

        car2 = new Car("Honda", "Civic");

        System.out.println( car1 );
        System.out.println(car2);

        System.out.println("---------------------------------------------");



        //     System.out.println( circle1.area() );

        System.out.println("-------------------------------");

        String str1 = "cybertek";
        str1 = "Cybertek School";
        str1 = null;

        System.out.println( str1.toUpperCase() );




    }







}

