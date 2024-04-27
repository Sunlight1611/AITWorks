package homework23.calculator23;
//В классе Calculator реализовать 5 методов для калькулятора (сложение, вычитание, умножение, деление с остатком, целая часть от деления), которыйработает с целыми числами.
//
//Создать CalculatorTest, покрыть все методы тестами.
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException(" ");

        }
        return a / b;
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException(" ");
        }
        return a % b;
    }
}


