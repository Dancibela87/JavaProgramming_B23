package day43_OOP_Encapsulation.ItemTask;

public class MyCart {

    public static Item item1, item2, item3, item4, item5;

    static {
     item1 = new Item("milka", 2,3);
     item2 = new Item("eggs",1,5);
     item3 = new Item("apple", 2.1,10);
     item4 = new Item("water",5,20);
     item5 = new Item("bread",2.5,4);

    }
}
/*
  create a class called MyCart
            create 5 static variables of Items
            Add a static block to to set all the static variables

 */