package homework;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        if (name.length() > 5) {
            System.out.println("Очень красивое имя! Рад познакомиться!");
        } else {
            System.out.println("Ваше имя Вам очень идёт.");
        }
        System.out.println("Сколько вам лет?");
        int age = scanner.nextInt();

        if (age > 120) {
            System.out.println("У вас прекрасный возраст.");
        } else {
            System.out.println("Ваши года - ваше богатство.");
        }
        System.out.println("Какой у вас рост? (cм)");
        int height = scanner.nextInt();
        if (height > 160) {
            System.out.println("Замечательно!");
        } else {
            System.out.println("Рост себе никто не выбирает!");
        }
        scanner.nextLine();
        System.out.println("Кто вы по профессии?");
        String profession = scanner.nextLine();
        if (profession.length() > 4) {
            System.out.println("У вас очень нужная профессия.");
        } else {
            System.out.println("Вы в жизни успели многое. Поздравляю.");

        }
    }

}














