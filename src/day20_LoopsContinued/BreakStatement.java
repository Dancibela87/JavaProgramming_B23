package day20_LoopsContinued;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i <=5; i++) {
            if(i==3){
                break;//forcefully stops at 3,use it only if we want to make it stop
            }
            System.out.println(i);
        }

        System.out.println("______________________________");

        for (int i = 0; i <=5 ; i++) {
            if(i==3){
                continue;//skips step and than continue executing, printing
            }
            System.out.println(i);

        }

        System.out.println("________________________");

        for (int i = 0; i <=10; i++) {
            if(i%2==0){
                continue;
            }
                System.out.println(i);
        }

        System.out.println("_________________________________");

        for (int i = 0; i <= 100 ; i++) {
            if(i%15!=0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("________________________");
        for (char i = 'A'; i < 'Z'; i++) {
            if(i=='D'|| i=='T' || i=='X'){
                continue;
            }
            System.out.println(i+" ");
        }





    }
}
