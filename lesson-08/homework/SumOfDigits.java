package homework;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1725;
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Сумма цифр числа 1725: " + sum);
    }
}


