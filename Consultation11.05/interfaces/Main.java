package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car1 = new KiaRio();
        Car car2 = new BMWM5();

        car1.go();
        car2.lightOn();
        car2.startEngine();
        car2.stopEngine();
        car2.go();
        car1.stop();

        Car[] cars = {car1, car2};

        for (Car car : cars) {
            car.go();
            car.lightOn();
            car.startEngine();
            car.stopEngine();
            car.go();
            car.stop();

            if (car instanceof BMWM5) {
                BMWM5 bmw = (BMWM5) car;
                bmw.helloWorld();

            }

        }
    }

}

