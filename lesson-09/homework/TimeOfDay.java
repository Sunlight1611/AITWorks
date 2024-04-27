package homework;
//Определение времени суток.
// Напишите программу, которая принимает на ход текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
import java.util.Scanner;

public class TimeOfDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите текущий час (от 0 до 23): ");
        int hour = input.nextInt();

        if (hour >= 0 && hour < 6) {
            System.out.println("Доброй ночи!");
        } else if (hour >= 6 && hour < 12) {
            System.out.println("Доброе утро!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}
