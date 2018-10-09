package interfacePratice_Combarable;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(20);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(34,"white",false);
        System.out.println("Hình tròn khi chưa sắp xếp ");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
        System.out.println(circles[0].compareTo(circles[1]));
//        Arrays.sort(circles);
//        System.out.println("Hình tròn sau khi được sắp xếp ");
//        for (ComparableCircle circle : circles){
//            System.out.println(circle);
//        }
    }
}
