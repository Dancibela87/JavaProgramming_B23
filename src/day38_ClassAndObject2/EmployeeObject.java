package day38_ClassAndObject2;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {
       Employee emp1 = new Employee();
       Employee emp2 = new Employee();
       Employee emp3 = new Employee();

       emp1.setInfo("Danka",125,100000,'F',"SDET");
        emp2.setInfo("Petar",126,120000,'M',"SDET");
        emp3.setInfo("Kaca",127,158000,'F',"SDET");

       Employee[] arr = {emp1,emp2, emp3};
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(arr));
         double budget =0;
        for(Employee each: employees){
           // System.out.println(each.name +" : "+ each.salary);
            System.out.println(each);
            budget += each.salary;
        }
        System.out.println(budget);




    }
}
