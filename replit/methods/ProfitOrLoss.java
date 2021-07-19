package methods;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));


    }
    public static String profits(int buyPrice,int sellPrice){

      String result ="";
      if(sellPrice>buyPrice){
          result="profit";
      }else if(buyPrice>sellPrice){
          result="loss";
      }else{
          result="no loss";
      }


return result;

    }
}
/*
Finish the profits method which accepts the buyPrice(int) and sellPrice(int) and
determines if there was a profit or loss.

It returns a string value that can be "profit","loss","no loss"
 */