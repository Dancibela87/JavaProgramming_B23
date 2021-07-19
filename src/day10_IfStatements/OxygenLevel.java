package day10_IfStatements;

public class OxygenLevel {
    public static void main(String[] args) {
        int level =50;
        String result ="";
        
        if(level>90){
            result="Your thank is full";
        }else if(level>80){
            result="Still ok";
        }else if( level>70){
            result="Do not go too far";
        }else if(level>60){
            result="Start to go back";
        }else {
           result="Be careful, you are at 50%";
        }

        System.out.println("result = " + result);
        
        
        
    }
    
    
    
}


        /*You are diving in the ocean. 
Your oxygen tank has a certain level (number) 
and you must print a message based on the level:
                Above 90 - Your tank is full
                Above 80 - Still okay
                Above 70 - Don't go too far
                Above 60 - Start to head back
                Above 50 - Be careful now you at at 50%
 */