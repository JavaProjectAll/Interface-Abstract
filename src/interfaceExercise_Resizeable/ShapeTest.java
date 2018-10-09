package interfaceExercise_Resizeable;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(30.5, 22.5, "black", true);
        System.out.println("Diện tích hình chữ nhật "+rect.getArea());
        System.out.println("Chu vi hình chữ nhật "+rect.getPerimeter());
        System.out.println(rect.toString());
        rect.resize(10);

        System.out.println();
        Circle circle = new Circle(12.5, "red", true);
        System.out.println("Diện tích hình tròn "+circle.getArea());
        System.out.println("Chu vi hình tròn "+circle.getPerimeter());
        System.out.println(circle.toString());
        circle.resize(10);

        System.out.println();
        Square square = new Square(20.5);
        System.out.println("Diện tích hình trụ "+square.getArea());
        System.out.println("Chu vi hình tròn "+square.getPerimeter());
        System.out.println(square.toString());
        square.resize(10);

    }
}
