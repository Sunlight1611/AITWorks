package homework;
/* Ввести с клавиатуры 10 пар целых чисел.
Сравните числа в каждой паре и напечатайте большие из них.
 Использовать цикл for и тернарный оператор.
 */
import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим 10 пар целых чисел и сравниваем их
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите пару целых чисел:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int biggerNumber = (num1 > num2) ? num1 : num2; // Определяем большее из двух чисел

            System.out.println("Большее из чисел: " + biggerNumber);
        }


    }
}

