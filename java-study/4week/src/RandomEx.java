import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Math.random(); // 0 ~ 0.9999...

        // 1~6
        for (int i = 0; i < 10; ++i) {
//            System.out.println(Math.random());
            System.out.println((int) (Math.random() * 6 + 1));
        }

        System.out.println("==============");

        Random r = new Random();

        for (int i = 0; i < 10; ++i) {
            int m = r.nextInt(10); // 0 ~ 9
            System.out.println(m);
        }
    }
}
