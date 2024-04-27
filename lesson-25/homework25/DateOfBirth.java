package homework25;

public class DateOfBirth {
    public static void main(String[] args) {
        // Задаем значение X (произведение дня рождения)
        int birthDay = 16;
        int birthMonth = 11;
        int birthYear = 1979;
        int X = birthDay + birthMonth + birthYear;

        // Вызываем метод для вычисления суммы чисел от 1 до X
        int sum = calculateSum(X);

        // Выводим результат
        System.out.println("Сумма чисел от 1 до " + X + " равна " + sum);

    }

    public static int calculateSum(int num) {
        // Переменная для хранения суммы
        int sum = 0;

        // Считаем сумму чисел от 1 до num
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        // Возвращаем результат
        return sum;
    }
}

