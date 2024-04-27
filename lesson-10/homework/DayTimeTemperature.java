package homework;
//Собрать в массив данные о дневной температуре в вашем городе
// за прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и
// затем в четверг. Найти среднюю температуру за прошлую неделю.
import java.util.Scanner;

public class DayTimeTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temperatures = new int[7];

        // Сбор данных о температуре за прошедшую неделю
        System.out.println("Ввести температуру за каждый день прошедшей недели:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Температура для дня : " );
            temperatures[i] = scanner.nextInt();
        }

        // Вывод температуры за вторник и четверг
        System.out.println("Температура во вторник: " + temperatures[1]);
        System.out.println("Температура в четверг: " + temperatures[3]);

        // Нахождение средней температуры за неделю
        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        double averageTemperature = (double) sum / temperatures.length;
        System.out.println("Средняя температура за неделю: " + averageTemperature);
    }
}

