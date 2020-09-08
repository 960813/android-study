// 인터페이스: 상수와 추상메소드만 가진다.
public interface Clock {
    public static final int ONDEAY = 24;    // 상수
    public abstract int getMinute();        // 추상 메소드
    public abstract int getHour();
    abstract public int setMinute();        // abstract와 public 순서 상관 X
}
