package day10_IfStatements;

public class CovertNumbersToWords {
    public static void main(String[] args) {
        int num = 5;
        String word ="";

        if( num >=0 && num<=9){
            if(num==0){
                word="zero";
            }else if( num==1){
                word="one";
            }else if(num==2){
                word="two";
            }else if(num==3){
                word="tree";
            }else if(num==4){
                word="four";
            }else if( num==5){
                word="five";
            }else if(num==6){
                word="six";
            }else if(num==7){
                word="seven";
            }else if(num==8){
                word="eight";
            }else{
                word="nine";
            }

        }else{
            word="Invalid number";
        }







    }
}
