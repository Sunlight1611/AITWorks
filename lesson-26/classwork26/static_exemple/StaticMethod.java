package classwork26.static_exemple;

public class StaticMethod {
    public static void main(String[] args) {
        Car bmw = new Car("BMW",0);
        bmw.go(31);
        bmw.go(64);
        bmw.go(98);

        Car audi = new Car("Audi",12);
        audi.go(31);
        audi.go(65);
        audi.go(38);

        String carArt1 = Car.drewCar(bmw);
        System.out.println(carArt1);

        String carArt2 = Car.drewCar(audi);
        System.out.println(carArt2);


    }
}
