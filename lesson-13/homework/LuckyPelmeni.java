package homework;
/*Задача про поиск "счастливого пельменя". Хозяйка налепила для гостей 30 пельменей.
 В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
Напишите программу, которая ищет счастливый пельмень.
 */
import java.util.Random;

public class LuckyPelmeni {
    public static void main(String[] args) {
        // Создаем массив из 30 пельменей
        int[] pelmeni = new int[30];

        // Вставляем монету в случайный пельмень
        Random random = new Random();
        int luckyPelmenIndex = random.nextInt(30);
        pelmeni[luckyPelmenIndex] += 15; // Увеличиваем вес пельменя, содержащего монету

        // Поиск счастливого пельменя
        for (int i = 0; i < 30; i++) {
            if (pelmeni[i] > 0) {
                System.out.println("Счастливый пельмень находится под номером " + (i + 1));

            }
        }
    }
}


