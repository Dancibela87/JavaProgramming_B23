package day43_OOP_Encapsulation;

public class RectangleObject {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5,8);

        System.out.println(rec1);

        rec1.setLength(4);
        rec1.setWidth(9);
        System.out.println(rec1);

        Rectangle rec2 = new Rectangle(4,9);
        System.out.println(rec2);
        System.out.println(rec1.equals(rec2));




    }
}
