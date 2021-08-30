package day41_Constractor;

public class EmployeeObjects {

    public static void main(String[] args) {
     Employee employee1 = new Employee("Danka", "SDET",10000);
     Employee employee2 = new Employee("Zorana", "QA", 85000);

        System.out.println(employee1);
        System.out.println(employee2);
        /*
        if you have constructor you do not need steInfo method. Constructor get
        executed authomaticly, and setInfo you have to call one by one.
        But to be able to print it you need toString method.
        It saves time and memory.

         */
    }
}
