package day28_Methods;

public class MethodsWithParameter {

    public static void eligible(int age){

        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

    }

    public static void main(String[] args) {

        eligible(21);//you have to provide age to do the function




    }
}
