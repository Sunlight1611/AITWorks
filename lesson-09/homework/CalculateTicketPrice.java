package homework;

import java.util.Scanner;

public class CalculateTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в кинотеатр!");

        System.out.print("Введите возраст клиента: ");
        int age = scanner.nextInt();

        System.out.print("Студент ли клиент? (да/нет): ");
        boolean isStudent = scanner.next().equalsIgnoreCase("да");

        System.out.print("Желает ли клиент VIP-место? (да/нет): ");
        boolean isVip = scanner.next().equalsIgnoreCase("да");

        double ticketPrice = calculateTicketPrice(age, isStudent, isVip);
        System.out.println("Итоговая стоимость билета: " + ticketPrice + " рублей.");

        scanner.close();
    }

    public static double calculateTicketPrice(int age, boolean isStudent, boolean isVip) {
        double standardPrice = 10.0;
        double studentDiscount = 0.1;
        double seniorDiscount = 0.25;
        double vipIncrease = 0.25;

        if (age >= 60) {
            standardPrice = standardPrice * (1 - seniorDiscount);
        } else if (isStudent) {
            standardPrice = standardPrice * (1 - studentDiscount);
        }

        if (isVip) {
            standardPrice = standardPrice * (1 + vipIncrease);
        }

        return standardPrice;
    }
}

