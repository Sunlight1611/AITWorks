package homework;
// Напишите программу для машины на светофоре. 
// Что делать, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Цвет светофора (красный, жёлтый или зелёный): ");
        String color = scanner.nextLine();

        if (color.equalsIgnoreCase("красный")) {
            System.out.println("Остановится!");
        } else if (color.equalsIgnoreCase("жёлтый")) {
            System.out.println("Приготовится к остановке!");
        } else if (color.equalsIgnoreCase("зелёный")) {
            System.out.println("Можем продолжить движение!");

        }
    }
}