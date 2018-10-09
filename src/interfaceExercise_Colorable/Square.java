package interfaceExercise_Colorable;

public class Square implements Colorable {
    private double side = 10.5;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howtoColor() {
        System.out.println("Color all four sides");
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }
}
