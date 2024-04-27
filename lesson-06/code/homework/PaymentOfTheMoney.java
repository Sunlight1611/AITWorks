package homework;

import java.util.Scanner;

// Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%. Сколько лет проработал работник вводится с клавиатуры.
public class PaymentOfTheMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Рабочий стаж: ");
        int yearsWorked = scanner.nextInt();

        double baseSalary = 500.0;
        double bonus = 0.0;

        if (yearsWorked >= 15) {
            bonus = baseSalary * 1.5;
        } else if (yearsWorked >= 10) {
            bonus = baseSalary;
        } else if (yearsWorked >= 5) {
            bonus = baseSalary * 0.5;
        } else if (yearsWorked >= 3) {
            bonus = baseSalary * 0.1;
        }

        double totalSalary = baseSalary + bonus;
        System.out.println("Зарплата работника: $" + totalSalary);
    }
}


