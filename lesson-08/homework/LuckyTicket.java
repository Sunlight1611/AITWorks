package homework;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число: ");
        int ticketNumber = scanner.nextInt();
//первый вариант разбиения изначального числа
        // (123456 / 1) % 10 = 6
        // (123456 / 1) % 10 = 5
        // (123456 / 1) % 10 = 4
        // (123456 / 1) % 10 = 3
        // (123456 / 1) % 10 = 2
        // (123456 / 1) % 10 = 1

        if (!(ticketNumber >= 100000 && ticketNumber <= 999999)){
            System.out.println("Значение некорректное");
            return;
        }

        int sum1 =0;
        int sum2 =0;
        // делитель
        int divider = 1;
        while (divider <= 100){
           int digit = ticketNumber / divider % 10;
           sum1 = sum1 + digit;
           divider = divider * 10;
        }
        while (divider <= 100000){
            int digit = ticketNumber / divider % 10;
            sum2 = sum2 + digit;
            divider = divider * 10;

            System.out.println("sum1= " + sum1);
            System.out.println("sum2= " + sum2);

            if (sum1 == sum2) {
                System.out.println("У вас счастливый билет");
            }else{
                System.out.println("Повезёт в любви!");
            }
            }

    }
}
