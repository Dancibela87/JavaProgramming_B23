package day38_ClassAndObject2;

public class Employee {

    public String name;
    public int employeeId;
    public double salary;
    public char gender;
    public String jobTitle;

    public void setInfo(String name, int employeeId, double salary, char gender, String jobTitle) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.gender = gender;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
