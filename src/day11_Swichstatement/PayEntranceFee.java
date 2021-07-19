package day11_Swichstatement;

public class PayEntranceFee {
    public static void main(String[] args) {
        
        String sport ="soccer";
       
        int amount =( sport =="soccer"|| sport=="tennis")? 100 : 50;

        System.out.println("amount = " + amount);
        








    }
}
/*
 Given a sport you play at the community center 
 you will have to pay some entrance fee. 

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY

 */