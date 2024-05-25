package classwork29;

public class CarApp {
    public static void main(String[] args) {
        Transport bmw = new Transport("BMW","personal");

        System.out.println(bmw);

        bmw.go();
        bmw.handleanimalOnWay();

    }

}
