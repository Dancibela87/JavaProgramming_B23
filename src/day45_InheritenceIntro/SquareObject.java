package day45_InheritenceIntro;

public class SquareObject {
    public static void main(String[] args) {
        Square square1 = new Square(5);//the only way to change the size is through the setter
        Square square2 = new Square(8);

        System.out.println(square1.area());
        System.out.println(square2.area());
        System.out.println(square1.perimeter());
        System.out.println(square2.perimeter());
        System.out.println(square1.equals(square2));
        System.out.println(square1.getSide());
        System.out.println(square2.getSide());
        square1.setSide(8);
        square1.setSide(10);

        Square s = new Square(5);
        Square s2=s;
        s2.setSide(10);
        System.out.println(s.getSide()+" : "+s2.getSide());



    }
}
