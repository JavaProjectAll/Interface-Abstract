package interfaceExercise_Resizeable;

public class Rectangle extends Shape {
    private double width = 10.0;
    private double length = 5.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "A rectangle with width = "
                + getWidth() + " and length = "
                + getlength();
    }

    @Override
    public void resize(double percent) {
        this.width += (this.width * percent) / 100;
        this.length += (this.length * percent) / 100;
        System.out.print("A rectangle increased size to " + percent + "% ");
        System.out.println("Width new = " + this.width + " - Length new = " + this.length);
    }
}
