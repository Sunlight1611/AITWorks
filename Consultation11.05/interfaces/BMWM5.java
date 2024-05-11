package interfaces;

public class BMWM5 implements Car{
    public void startEngine() {
        System.out.println("BMWM5 is starting engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMWM5 is stopping engine");
    }

    @Override
    public void go() {
        System.out.println("BMWM5 is going");
    }

    @Override
    public void stop() {
        System.out.println("BMWM5 is stopping");
    }

    @Override
    public void lightOn() {
        System.out.println("BMWM5 turned on lights");
    }

    @Override
    public void lightOff() {
        System.out.println("BMWM5 turned off lights");
    }
    public void helloWorld(){
        System.out.println("Hello World");
    }
}
