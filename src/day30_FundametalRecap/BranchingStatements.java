package day30_FundametalRecap;

public class BranchingStatements {
    public static void main(String[] args) {
        /*
        break: used in loop and switch, it exit them
        continue: used just in loop, skips iteration
        return: exits the methods
        System.exit()- it terminates the whole program
         */

        for (int i = 0; i <=5; i++) {
            if(i==3){
                //break;//exits the loop     - 0 1 2
                // return; exits the main method =0 1 2
                // continue -skips 3 -0 1 2 4 5
                //System.exit(0);// - exits the whole program
            }
            System.out.println(i);
        }
        System.out.println("Hello everyone"); //it wont be printed if we use return, but it will with break



    }
}
