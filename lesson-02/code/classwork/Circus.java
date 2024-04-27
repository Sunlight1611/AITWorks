package classwork;

public class Circus {
    public static void main(String[] args) {

        lightOn();
        entrtainer();
        lightOff();

    }//end of main

    private static void lightOff() {
        System.out.println("Light OFF");
    }

    private static void entrtainer() {
        jogger();
        clown();
        singer();
    }

    private static void singer() {
        System.out.println("Im singing in the rain...");
    }

    private static void clown() {
        System.out.println("I'm jocking!");
    }

    private static void jogger() {
        System.out.println("I'm jogger, i'm jogging! ");
    }

    private static void lightOn() {
        System.out.println("Light is ON");
    }
}// end of class
