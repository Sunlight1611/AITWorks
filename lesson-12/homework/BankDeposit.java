package homework;

import java.util.Scanner;

public class BankDeposit {
    // Метод для расчета суммы вклада через n лет
    public static double calculateDeposit(double initialDeposit, int years) {
        double interestRate = 0.03; // Процентная ставка
        double total = initialDeposit;

        // Проходим по каждому году и рассчитываем сумму вклада
        for (int i = 0; i < years; i++) {
            total += total * interestRate; // Добавляем проценты к текущей сумме вклада
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим начальную сумму вклада
        System.out.print("Вводим сумму вклада (в евро): ");
        double deposit = scanner.nextDouble();

        // Вводим количество лет
        System.out.print("Вводим количество лет: ");
        int years = scanner.nextInt();

        // Вызываем метод для расчета суммы вклада через заданное количество лет
        double finalDeposit = calculateDeposit(deposit, years);

        // Выводим результат
        System.out.println("Сумма вклада через " + years + " лет: " + finalDeposit + " евро.");
    }
}

