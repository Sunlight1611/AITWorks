package classwork30.calculator;

public class LambdaApp {
    public static void main(String[] args) {
        Calculator plus = (a, b) -> a + b;
        //Синтаксический сахар, то же что и в классе Calculator
        Calculator minus = (a, b) -> a - b;

        int resultSum = plus.operate(5, 6);
        System.out.println("sum: " + resultSum);

        int resultDiff = minus.operate(10, 5);
        System.out.println("diff: " + resultDiff);


    }
}
