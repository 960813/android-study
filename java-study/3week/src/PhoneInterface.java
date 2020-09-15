public interface PhoneInterface {
    public static final int TIMEOUT = 10000;
    public abstract void sendCall();
    void receiveCall();

    default void printLogo() {
        System.out.println("**Phone**");
    }
}
