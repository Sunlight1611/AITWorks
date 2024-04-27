package homework;

public class Cube {
    private double a; // сторона куба

    // Конструктор для инициализации стороны куба
    public Cube(double a) {
        this.a = a;
    }

    // Метод для вычисления периметра куба
    public double calculatePerimeter() {
        return 12 * a;
    }

    // Метод для вычисления площади куба
    public double calculateSurfaceArea() {
        return 6 * a * a;
    }

    // Метод для вычисления объема куба
    public double calculateVolume() {
        return a * a * a;
    }
}

