package day45_InheritenceIntro.EmployeeTask;

public class Driver extends Employee{

    public Driver(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }
    public void drive(){
        System.out.println(name+" is driving");
    }

}
