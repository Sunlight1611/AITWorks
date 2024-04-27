package homework;

/*Написать метод, принимающий массив целых чисел, и возвращающий среднее арифметическое всех его элементов.
 */
public class CalcAverage {
    public static void main(String[] args) {
        int[] array = {145, 85, 238, 612, 562};


        System.out.println("Массив:");
        printArray(array);

        double average = calculateAverage(array);

        System.out.println("Среднее арифметическое: " + average);
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        return (double) sum / array.length;
    }
}


