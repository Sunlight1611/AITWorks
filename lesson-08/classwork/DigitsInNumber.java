package classwork;

import java.util.Scanner;

//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.
//356712 -это ввёл пользователь, программа должна выдать 6 цифр
//1234567890987654321 - 19 цифр
public class DigitsInNumber {
    public static void main(String[] args) {
        //Алгоритм:
        //числа записываются в 10-тичной системе счисления, каждый знак отвечает за разряд числа
        //будем на каждом шагу делить числа на 10 с остатком.


        // Взаимодействие с пользователем:
        // запросить у него число
        // напечатать число = количеству цифр
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positiv number: ");
        long number = scanner.nextLong();
        int count = 0;


        while (number > 0) {

            number = number / 10;//деление даёт нам сколько цифр
            count++;//увеличиваем счётчик
            System.out.println("Number of digits are: " + count);
        }


    }
}
