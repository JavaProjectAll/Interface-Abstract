package interfacePractice_ComparatorGeometry;

public interface Comparator<C extends Shape> {
    int compareCircle(Circle c1, Circle c2);
    int compareRectangle(Rectangle r1, Rectangle r2);
}
