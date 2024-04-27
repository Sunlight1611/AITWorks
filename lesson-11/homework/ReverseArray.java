package homework;
/*Написать метод, принимающий массив целых чисел, и разворачивающий его.
Последний элемент становится нулевым, предпоследний, первым, и т. д.
Этот метод должен изменить полученный массив.*/

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {52, 68, 114, 238, 389};


    }

    public static void printReverseArr(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();


    }
}

