package day41_Constractor.CircleTask;

public class CircleObjects {
    public static void main(String[] args) {
       Circle circle1 = new Circle(5);
       Circle circle2 = new Circle(2);
       Circle circle3 = new Circle(4);

        System.out.println(circle1.calculateArea());
        System.out.println(circle1);
        System.out.println(circle1.perimeter());
        System.out.println(circle2);



    }

}
