package interfaceExercise_Resizeable;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(30.5, 22.5, "black", true);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        System.out.println(rect.toString());

        Circle circle = new Circle(12.5, "red", true);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.toString());

        Square square = new Square(20.5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.toString());
    }
}
