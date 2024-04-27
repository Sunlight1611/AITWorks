package homework;
// /1.Метод вычисляющий площадь круга;
////2.Метод вычисляющий площадь квадрата;
////3.Метод вычисляющий площадь прямоугольника (чуть сложнее чем 1. и 2.);
////4.В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль.
// Например: площадь круга для R = 200, площадь квадрата со стороной 500,
// площадь прямоугольника со сторонами 1000 и 2000.
public class MathMethode {


        public static void main(String[] args) {
            double circleRadius = 500;
            double squareSide = 100;
            double rectangleLength = 1000;
            double rectangleWidth = 2000;

            double circleArea = calculateCircleArea(circleRadius);
            double squareArea = calculateSquareArea(squareSide);
            double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);

            System.out.println("Area of a circle is " + circleArea);
            System.out.println("Area of a square  is " + squareArea);
            System.out.println("Area of a rectangle is " + rectangleArea);


        }

        private static double calculateRectangleArea(double rectangleLength, double rectangleWidth) {
            return rectangleLength * rectangleWidth;
        }

        private static double calculateSquareArea(double squareSide) {
            return squareSide * squareSide;
        }

        private static double calculateCircleArea(double circleRadius) {
            return Math.PI * (circleRadius * circleRadius);

        }


    }














