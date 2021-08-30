package day45_InheritenceIntro.EmployeeTask;

public class Amazon {
    public static void main(String[] args) {

        Tester tester = new Tester("Muhtar",'m',25,5,"SDET",50000);
        tester.eat();
        tester.drink();
        tester.sleep();
        tester.testing();

        Developer developer = new Developer("Danka",'f',28,9,"Developer",150000);
        developer.eat();
        developer.drink();
        developer.sleep();
        developer.code();
        developer.fixBugs();

        Driver driver = new Driver("Petar",'m',33,8,"driver",40000);
        driver.eat();
        driver.drink();
        driver.sleep();
        driver.drive();




    }
}
