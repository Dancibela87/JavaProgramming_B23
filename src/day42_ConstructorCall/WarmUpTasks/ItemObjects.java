package day42_ConstructorCall.WarmUpTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObjects {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item("apple", 5,10),
                new Item("milk", 8.2,8),
                new Item("water", 4,25),
                new Item("rice", 5.4,7),
                new Item("pears", 3.9,9),
                new Item("juice", 5,10),
                new Item("corn", 4,18),
                new Item("soap", 15.5,3),
                new Item("toilet paper", 20.3,15)

        ));

        items.removeIf(item-> item.unitPrice > 8);

        double totalPrice = 0;
        for( Item eachItem: items){
            totalPrice += eachItem.calcCost();
        }
        System.out.println(totalPrice);









    }
}
