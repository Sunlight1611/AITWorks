package homework;

import java.util.Random;
import java.util.Scanner;

/*Задать массив из 10 случайных целых чисел в интервале от -20 до 20.
Запросить у пользователя какое-то целое число.
Определить, есть ли это число в массиве.
Создать и использовать метод searchInArray, который получает на вход массив и искомое число,
а возвращает ответ - нашлось ли это число в массиве.
 */
public class RandomNumbers {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10, -20, 20);

        System.out.println("Сгенерированный массив:");
        printArray(array);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести целое число для поиска: ");
        int number = scanner.nextInt();


        if (searchInArray(array, number)) {
            System.out.println("Число " + number + " найдено в массиве.");
        } else {
            System.out.println("Число " + number + " не найдено в массиве.");
        }
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }


    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static boolean searchInArray(int[] array, int target) {
        for (int number : array) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }
}

