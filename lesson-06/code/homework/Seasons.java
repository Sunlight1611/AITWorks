package homework;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод номера месяца (от 1 до 12): ");
        int monthNumber = scanner.nextInt();

        String season = "";
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
        }

        System.out.println("Месяц " + monthNumber + " сезон " + season);
    }
}

