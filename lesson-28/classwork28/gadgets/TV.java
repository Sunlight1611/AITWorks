package classwork28.gadgets;

public class TV implements RemoteController {

    @Override
    public void on() {
        System.out.println("TV is on.");
    }

    @Override
    public void off() {
        System.out.println("TV is off.");
    }

    @Override
    public void minus() {
        System.out.println("TV make minus.");
    }

    public void plus() {
        System.out.println("TV make plus.");
    }
}