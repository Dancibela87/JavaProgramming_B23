package day29_MethodsContinued;

public class SystemExitVsReturn {
    public static void main(String[] args) {

        passOrFAiled(150);
        System.out.println(" Test Completed ");
        passOrFAiled(100);

    }

    public static void passOrFAiled(int score){

        if(score<0 || score>100){
            System.out.println("Invalid");
            return;           //executes just  this method
            // System.exit(0);//terminate everything
            //System.out.println("Hello"); after return this is not reachable
        }

        if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }

}
