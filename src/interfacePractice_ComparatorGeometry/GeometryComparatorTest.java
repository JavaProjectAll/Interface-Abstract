package interfacePractice_ComparatorGeometry;

public class GeometryComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(20, "black", false);
        circles[1] = new Circle(18, "black", false);
        Rectangle[] r = new Rectangle[2];
        r[0] = new Rectangle(20, 15, "red", true);
        r[1] = new Rectangle(23, 10, "red", true);
        Comparator geometry = new GeometryComparator();
        System.out.println(geometry.compareCircle(circles[0], circles[1]));
        System.out.println(geometry.compareRectangle(r[0], r[1]));
    }
}
