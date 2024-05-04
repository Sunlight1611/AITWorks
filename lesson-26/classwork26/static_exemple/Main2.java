package classwork26.static_exemple;

public class Main2 {
    public static void main(String[] args) {
        Car bmw = new Car("BMV", 0);
        Car audi = new Car("Audi",35);

        System.out.println(bmw);
        System.out.println(audi);

        bmw.go(20);
        bmw.go(45);
        bmw.go(55);
        audi.go(3);
        audi.go(12);

        System.out.println(bmw);
        System.out.println(audi);

    }
}