package day46_InheritanceContinue.ShapeTAsk;

public class Shape {
    private final String name;
    public final static boolean isShape ;
    public final static boolean hasArea ;
    public final static boolean hasPerimeter ;

    static {
        isShape = true;
        hasArea = true;
        hasPerimeter = true;
    }
    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calcArea(){
        return 0;
    }
    public double calcPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area= " +calcArea()+
                "perimeter= " + calcPerimeter() +
                '}';
    }

}
