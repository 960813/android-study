class NewRect {
    int width;
    int height;

    public NewRect() {

    }

    public NewRect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return width + ":" + height;
    }

    public boolean equals(NewRect obj) {
        return this.width == obj.width && this.height == obj.height;
    }
}

public class ReactEqualsEx {
    public static void main(String[] args) {
        NewRect rectOne = new NewRect(2, 3);
        NewRect rectTwo = new NewRect(2, 3);

        if (rectOne.equals(rectTwo)) {
            System.out.println("rectOne is equal to rectTwo");
        } else {
            System.out.println("rectOne is not equal to rectTwo");
        }
    }
}
