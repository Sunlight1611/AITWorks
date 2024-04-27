package homework;
// Площадь треугольника по стороне и высоте треугольника
// Гипотенуза по двум катетам (теорема Пифагора)
// Величина 3-го угла треугольника по известным первым двум
public class AreaHypotenuseTreangleSize {
    public static void main(String[] args) {
        System.out.println("Длина стороны треугольника");
        System.out.println("Высота треугольника");
        double height = 35;
        double side;
        side = 20;
        double area = (side * height) / 2;
        System.out.println("Площадь треугольника" + area);

        System.out.println("Длина первого катета");
        double firstCatet =  2;
        System.out.println("Длина второго катета");
        double secondCatet = 2;
        double hypotenuse = Math.sqrt (Math.pow(firstCatet, 2) + Math.pow (secondCatet, 2));

        System.out.println("Длина гипотенузы" +  hypotenuse);

        System.out.println("Длина стороны треугольника");
        side = 20;
        System.out.println("Высота треугольника");
        height = 35;
        System.out.println("Площадь треугольника" + area);
        area = (side * height) / 2;


    }
}
