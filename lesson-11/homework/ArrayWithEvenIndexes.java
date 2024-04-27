package homework;
/*Написать метод, принимающий массив целых чисел, и возвращающий произведение всех его элементов с четными индексами.
Задать массив из 10 случайных чисел в интервале от -10 до 10*/

import java.util.Random;

public class ArrayWithEvenIndexes {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10, -10, 10);

        System.out.println("Сгенерированный массив:");
        printArray(array);


        int arraywithevenindexes = calculateProductOfEvenIndexElements(array);


        System.out.println("Произведение всех элементов массива с четными индексами: " + arraywithevenindexes);
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

    public static int calculateProductOfEvenIndexElements(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i += 2) {
            product *= array[i];
        }
        return product;
    }
}

