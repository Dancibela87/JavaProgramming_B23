package day40_Statics;

import day38_ClassAndObject2.Employee;

public class HumanResources {
    public static int z = 100;
    public static Employee employee1 = new Employee(); // Ahmet
    //  employee1.setInfo("Ahmet",'M', 1, "SDET", 100000);
    public static Employee employee2 = new Employee();
    public static Employee employee3 = new Employee();
    public static Employee employee4 = new Employee();
    public static Employee employee5 = new Employee();

    static {
        employee1.setInfo("Ahmet",1, 100000, 'M', "SDET");
        employee2.setInfo("John",2, 120000, 'M',"QA");
        employee3.setInfo("Daniel",3, 130000, 'F', "QA");
        employee4.setInfo("Aaron",4, 14450, 'M', "SDET");
        employee5.setInfo("Chris",5, 150000, 'F', "SDET");
    }


    /*
    public static void main(String[] args) {
        employee1.setInfo("Ahmet",'M', 1, "SDET", 100000);
    }
*/
}
