// 인터페이스를 다중구현
// 인터페이스를 이용하면 다중 상속의 효과를 낼 수 있다.
public class MouseDriver1 implements USBMouseInterface, RollMouseInterface {
    @Override
    public void roll() {

    }

    @Override
    public void mouseMove() {

    }

    @Override
    public void mouseClick() {

    }
}
