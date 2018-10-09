package interfaceExercise_Resizeable;

public class Square extends Rectangle{
    private double side = 10.5;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "A square with side = "
                + getSide();
    }

    @Override
    public void resize(double percent){
        this.side += (this.side*percent)/100;
        System.out.print("A rectangle increased size to " + percent + "% ");
        System.out.println("Side new = "+this.side);
    }
}