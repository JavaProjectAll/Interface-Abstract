package interfaceExercise_Colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(20.5);
        squares[1] = new Square(12.5);
        squares[2] = new Square(31.5);
        for (Square square : squares){
            System.out.println("Hình vuông cạnh = "
                    +square.getSide()+" có diện tích là "
                    +square.getArea());
            square.howtoColor();
        }
    }
}
