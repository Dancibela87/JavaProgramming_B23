package day10_IfStatements;

public class NameOfMonth {
    public static void main(String[] args) {
        int num= 8;//1-12
         String nameOfMonth= "";

        if(num ==1){
            nameOfMonth="January";
        }else if (num==2){
            nameOfMonth="February";
        }else if(num==3){
            nameOfMonth="March";
        }else if(num==4) {
            nameOfMonth = "April";
        }else if( num==5){
            nameOfMonth="may";
        }else if (num==6){
            nameOfMonth="June";
        } else if(num==7){
            nameOfMonth="July";
        }else if(num==8){
            nameOfMonth="Avgust";
        }else if(num==9){
            nameOfMonth="September";
        }else if(num==10){
            nameOfMonth="October";
        }else if(num==11){
            nameOfMonth="November";
        }else {
            nameOfMonth="December";
        }
        System.out.println("nameOfMonth = " + nameOfMonth);




    }
}
