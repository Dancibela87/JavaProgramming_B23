package methods2;

import java.util.Scanner;

public class thunderBlazz {
    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3){

        // your code here
        boolean getThunderBlazz=true;
        boolean rightIngridents = (ingredient1==1 && ingredient2==2  && ingredient3==3) ||(ingredient1==2 && ingredient3==1 && ingredient2==3) ;
        if(available==true || gift==true || rightIngridents==true ||(ingredient1==3 && ingredient2==1 && ingredient3==2)){
            return true;
        }else{
            return false;
        }


    }


    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    }
}
/*
There are a few ways to get this galacticly popular drink, if its available at the store you can buy it. or you can get it as a gift. The third option is to mix its ingredients (its a secret formula):

1 from ingredient1 ,2 from ingredient2 and 3 from ingredient3.

or the alternate recipe: 3 from ingredient1, 1 from ingredient2 and 2 from ingredient3.

You need to have exact amount of ingredients for making the drink. not less or more

getThunderBlazz(boolean avilable,boolean gift, int ingredient1,
   int ingredient2, int ingredient3)
getThunderBlazz(boolean avilable,boolean gift, int ingredient1,
   int ingredient2, int ingredient3)
available(boolean) = available at store gift(boolean) = got it as a gift the three ingredients as ints
 */