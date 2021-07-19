package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {
        String firstName = "Danka";
        String lastName = "Pavlovic";
        String fullName = firstName +" " + lastName;
        //Employee; full name is: Danka Pavlovic
        String gender = "female";
        //Danka Pavlovic is female
        int age = 34;
        //Danka Pavlovic is 34 years old
        String companyName = "Intercontinental Hotel";
        //Danka Pavlovic works at
        String jobTitle = "Banquet server";
        //Danka Pavlovic is
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 100000;

        System.out.println("fullName = " + fullName);
        System.out.println("Employee' full name is: "+fullName);
        System.out.println(fullName +" is " + gender);

        System.out.println(fullName +" is "+age + " years old");
        System.out.println(fullName + " works at "+ companyName);
        System.out.println(fullName +" job title is "+jobTitle);

        System.out.println(fullName+ " is married: "+ isMarried);
        System.out.println(fullName + " is full time: "+ isFullTime);
        System.out.println("Employee's salary is: $"+ salary);








    }
}
