package classwork30.calculator;

public class App {
    public static void main(String[] args) {
        Calculator plus = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        Calculator minus = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };

        int resultSum = plus.operate(5, 6);
        System.out.println("sum: " + resultSum);

        int resultDiff = minus.operate(10, 5);
        System.out.println("diff: " + resultDiff);


    }
}
