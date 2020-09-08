public class CircleEx {
    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);


        Circle donut;
        donut = new Circle(2, "피자도넛");

        double area1 = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area1);

    }
}
