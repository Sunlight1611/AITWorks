package homework;

public class Calculations {
    // метод для вычисления площади круга
    public static double calcCircleArea(double radius) {
        return Math.PI * Math.pow (radius,2);

    }
    //Метод для вычесления плошади квадрата
    public static double calcSquareArea(double side) {
        return Math.pow(side, 2);
    }

    //Метод для вычесления площади прямоугольника
    public static double calcRectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        double circleRadius = 200;
        double squareSide = 500;
        double rectangleLength = 1000;
        double rectangleWidth = 2000;

        double circleArea = calcCircleArea(circleRadius);
        System.out.println("Площадь круга для R=" + circleRadius + ":" + circleArea);
        double squareArea = calcSquareArea(squareSide);
        System.out.println("Площадь квадрата со стороной" + squareSide + ":" + squareArea);
        double RectangleArea = calcRectangleArea(rectangleLength, rectangleWidth);

        System.out.println("Площадь прямоугольника со сторонами" + rectangleLength + "и" + rectangleWidth + ":" + RectangleArea);

    }
}



