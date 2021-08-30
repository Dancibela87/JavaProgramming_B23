package day46_InheritanceContinue.ShapeTAsk;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println(circle.calcArea());
        System.out.println(circle.calcPerimeter());
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(5,8);
        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());
        System.out.println(rectangle);

        Square square = new Square(5.2);
        System.out.println(square.calcArea());
        System.out.println(square.calcPerimeter());
        System.out.println(square);



    }

}
