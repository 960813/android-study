public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhoneOne sp = new SamsungPhoneOne();

        // SamsungPhoneOne�� ���� �� �ִ� Ÿ���� ?
        // ���������� ���� 6���� Ÿ������ ǥ���� �� �ִ�.
        SamsungPhoneOne typeOne = new SamsungPhoneOne();
        PDA typeTwo = new SamsungPhoneOne();
        PhoneInterface typeThree = new SamsungPhoneOne();
        MobilePhoneInterface typeFour = new SamsungPhoneOne();
        MP3Interface typeFive = new SamsungPhoneOne();
        Object typeSix = new SamsungPhoneOne();
    }
}
