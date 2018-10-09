package interfaceExercise_Resizeable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius();
    }

    @Override
    public void resize(double percent) {
        this.radius += (this.radius * percent) / 100;
        System.out.print("A circle increased size to " + percent + "% ");
        System.out.println("Radis new = " + this.radius);
    }
}
