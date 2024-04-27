package homework;

import java.util.Random;

/*Написать метод, принимающий массив целых чисел, и возвращающий сумму всех его нечетных элементов.
Задать массив из 10 случайных чисел в интервале от -10 до 10
 */
public class OddArrayNumbers {
    public static void main(String[] args) {

        int[] array = generateRandomArray(10, -10, 10);


        System.out.println("Сгенерированный массив:");
        printArray(array);


        int sumOfOddNumbers = calculateSumOfOddNumbers(array);


        System.out.println("Сумма всех нечетных элементов массива: " + sumOfOddNumbers);
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

    public static int calculateSumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }
}

