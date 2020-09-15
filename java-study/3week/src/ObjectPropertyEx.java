class PointOne {
    int x, y;

    public PointOne() {
    }

    public PointOne(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ObjectPropertyEx {
    // Method Parameter Polymorphism
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }

    public static void main(String[] args) {
        PointOne p = new PointOne(2, 3);
        print(p);
        System.out.println("=============");

        ObjectPropertyEx.print(p);
        System.out.println("=============");

        ObjectPropertyEx pp = new ObjectPropertyEx();
        pp.print(p);
    }
}
