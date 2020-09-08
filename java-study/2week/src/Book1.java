public class Book1 {
    String title;
    String author;

    public Book1() {
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book1(String title) {
        this(title, "작자미상");
    }

    public Book1(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // toString 오버라이딩

    @Override
    public String toString() {
        return title + ":" + author;
    }

    public static void main(String[] args) {
        Book1 littlePrince = new Book1("어린왕자", "생텍쥐페리");
        Book1 loveStory = new Book1("춘향전");

//        System.out.println(littlePrince.title + " " + littlePrince.author);
//        System.out.println(loveStory.title + " " + loveStory.author);
        System.out.println(littlePrince);
        System.out.println(loveStory);
    }
}
