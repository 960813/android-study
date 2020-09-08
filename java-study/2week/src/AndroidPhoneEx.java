// AndroidPhone이 가질 수 있는 타입의 종류는 몇개인가?
// 인터페이스 5개 + 클래스 1개 + Object 1개
public class AndroidPhoneEx {
    public static void main(String[] args) {
        AndroidPhone androidPhone = new AndroidPhone();

        // 다형성
        ISmartPhone iSmartPhone = new AndroidPhone();
        MP3 mp3 = new AndroidPhone();
        Camera camera = new AndroidPhone();
        Phone phone = new AndroidPhone();
        Internet internet = new AndroidPhone();
        Object object = new AndroidPhone();
    }
}
