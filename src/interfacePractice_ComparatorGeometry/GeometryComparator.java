package interfacePractice_ComparatorGeometry;

public class GeometryComparator implements Comparator {

    @Override
    public int compareCircle(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()){
            return 1;
        }else if(c1.getRadius() < c2.getRadius()){
            return -1;
        }
        return 0;
    }

    @Override
    public int compareRectangle(Rectangle r1, Rectangle r2) {
        if (r1.getArea() > r2.getArea()){
            return 1;
        }else if (r1.getArea() < r2.getArea()){
            return -1;
        }
        return 0;
    }
}
