package homework;
//Площадь треугольника по стороне и высоте треугольника.
public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Длина стороны треугольника");
        double side = 20;
        System.out.println("Высота треугольника");
        double height = 35;
        double area = (side * height) / 2;
        System.out.println("Площадь треугольника" + area);
    }
}
