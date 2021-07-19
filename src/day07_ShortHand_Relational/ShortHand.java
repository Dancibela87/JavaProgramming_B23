package day07_ShortHand_Relational;

public class ShortHand {
    public static void main(String[] args) {
        String name1 = "Muhtar";
        String name2 = "Mehmet";
        String name3 = name2;//name3= Mehmet
        name2 = name1;
        name1 = name3;//name1 = Mehmet

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("___________");
        
        int a = 200;
        System.out.println("a = " + a);//it will print 200
        int b = a;//to memorize original value
        a = 100 + 300;
        System.out.println("a = " + a);

        System.out.println("_______________");
        int balance = 300;
       // balance = 200;//it will print 200
        balance+=200;//now it will add and print 500 ;
        //balance = balance + 200 == balance +=200
        System.out.println("balance = " + balance);//500
        balance +=1000;
        System.out.println("balance = " + balance);//1500
        
        String school = "Cubertek";
        school +="School";
        System.out.println("school = " + school);

        String name = "John";
        String lastName = "Daniel";
        name +=" " + lastName;//you can do this way as well
        System.out.println("name = " + name);

        System.out.println("___________________");

        //withdraw money
        balance -=300;
        System.out.println("balance = " + balance);
        //*= multiplication
        double salary = 100000;
        salary *=2;
        System.out.println("salary = " + salary);
        
        salary *= 1.5;
        System.out.println("salary = " + salary);

        //0.65
        salary *=0.65;
        System.out.println("salary = " + salary);
        
        // /= division
        double slices = 10;
        slices /=3;
        System.out.println("slices = " + slices);


        // %=
        int cents = 105;//105 cents == 4 quarters and 5 cents
       int quarter = cents /25;//but there is remainder
        


        cents %=25;

        System.out.println("quarter = " + quarter);
        System.out.println("cents = " + cents);


















    }
}
