package day19_LoopsIntroForLoop;

public class loopPractice {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");//without ln prints in one line
        }
        System.out.println();
        System.out.println("hello");

        System.out.println("____________________________________________");

        for(int i = 1; i<100;i+=2){
            System.out.print(i+" ");
        }

        for(int i =1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("__________________________");
        for (int i = 1; i < 101 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        for (int i = 2; i < 101; i+=2) {
            System.out.print(i +" ");
        }

        System.out.println("_____________________________");

        String odds ="";
        String even = "";
        for (int i = 1; i <101 ; i++) {
            if(i%2!=0){
                odds += i+" ";
            }else{
                even += i+" ";
            }

        }







    }
}
