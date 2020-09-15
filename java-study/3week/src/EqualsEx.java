class PointTwo {
    int x, y;

    public PointTwo() {

    }

    public PointTwo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString()
    @Override
    public String toString() {
        return x + ":" + y;
    }

    // equals()
    public boolean equals(PointTwo obj) {
        return this.x == obj.x && this.y == obj.y;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        PointTwo source = new PointTwo(2, 3);
        PointTwo destination = new PointTwo(2, 3);

        System.out.println(source);
        System.out.println(destination);

        System.out.println(source.equals(destination));

        PointTwo newDestination = new PointTwo(4, 5);
        System.out.println("source, newDestination ºñ±³: " + source.equals(newDestination));
    }
}
