package classwork26.classwork26_final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите радиус окружности: ");
        double radius = scanner.nextDouble();
        double circleArea = Constants.PI * radius * radius;
        System.out.println("Площадь окружности: " + circleArea);

    }
}
