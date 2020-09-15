public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhoneOne sp = new SamsungPhoneOne();

        // SamsungPhoneOne이 가질 수 있는 타입은 ?
        // 다형성으로 인해 6개의 타입으로 표현할 수 있다.
        SamsungPhoneOne typeOne = new SamsungPhoneOne();
        PDA typeTwo = new SamsungPhoneOne();
        PhoneInterface typeThree = new SamsungPhoneOne();
        MobilePhoneInterface typeFour = new SamsungPhoneOne();
        MP3Interface typeFive = new SamsungPhoneOne();
        Object typeSix = new SamsungPhoneOne();
    }
}
