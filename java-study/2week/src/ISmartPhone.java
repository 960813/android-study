// 인터페이스를 다중상속이 가능하다.
// 스펙 + 스펙 + ... = 새로운 스펙
// 1 + 2 + 2 + 1 + 1 = 7개의 기능을 가진다.
public interface ISmartPhone extends MP3, Camera, Phone, Internet {
    void internet();
}
