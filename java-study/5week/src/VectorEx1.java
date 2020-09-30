import java.util.HashSet;
import java.util.Objects;
import java.util.Vector;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

public class VectorEx1 {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<Point>();

        v.add(new Point(2, 3));
        v.add(new Point(-5, 20));
        v.add(new Point(30, -8));

        v.remove(1);

        for (int i = 0; i < v.size(); ++i) {
            Point p = v.get(i);
            System.out.println(p);
        }

        System.out.println();
        System.out.println("===HashSet Test===");
        System.out.println();

        // HashSet Test
        // Set 계열: 중복 X, 순서 O
        HashSet<Point> set = new HashSet<Point>();
        set.add(new Point(2, 3));
        set.add(new Point(-5, 20));
        set.add(new Point(2, 3));
        set.add(new Point(30, -8));

        for (int i = 0; i < set.size(); ++i) {
            Object[] obj = set.toArray();
            System.out.println(obj[i]);
        }

        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
