package classwork;

import java.util.Scanner;

//Пользователь вводит натуральное число n. Определите, является ли оно простым.
// Простое число - это число, которое делится на себя и на 1.
// Обеспечьте защиту от ввода пользователя отрицательных чисел.
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number");
        int number = scanner.nextInt();
        while (number <=0){
            System.out.println("Whrong input,try again");
            number = scanner.nextInt();
        }
        //пользователь ввёл какое-то число
        //65 ввёл пользователь, будем пробовать делить 65 на 2,3,4,5,....
        //если хоть на какое-то число разделиться без остатка, \
        // то это будет НЕ простое число, а иначе, это будет ПРОСТОЕ число.

        boolean isPrime = true;

        int div = 2;
        while (div < number){

        }


    }
}
