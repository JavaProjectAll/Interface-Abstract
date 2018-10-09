package interfacePractice_ComparatorGeometry;

import java.util.Arrays;

public class GeometryComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(20, "black", false);
        circles[1] = new Circle(18, "black", false);

        Rectangle[] r = new Rectangle[2];
        r[0] = new Rectangle(20, 15, "red", true);
        r[1] = new Rectangle(23, 10, "red", true);

        Comparator circleComparator = new CircleComparator();
        System.out.println(circleComparator.compare(circles[0], circles[1]));

        Comparator rectComparator = new RectangleComparator();
        System.out.println(rectComparator.compare(r[0], r[1]));

        System.out.println("Thứ tự hình tròn");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        System.out.println("Thứ tự hình vuông");
        for (Rectangle rect : r){
            System.out.println(rect);
        }

    }
}
