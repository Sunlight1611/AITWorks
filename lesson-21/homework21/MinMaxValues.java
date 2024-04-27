package homework21;
/* Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов:
 byte, short, char, int, long, float, double
 Типы как объекты String должны браться из аргументов основной функции main.
Если в аргументах нет какого-либо типа (не указан тип),
 приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double).
Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.*/

public class MinMaxValues {
    public static void main(String[] args) {
        for (String arg : args) {
            switch (arg) {
                case "byte":
                    printMinMaxByte();
                    break;
                case "short":
                    printMinMaxShort();
                    break;
                case "char":
                    printMinMaxChar();
                    break;
                case "int":
                    printMinMaxInt();
                    break;
                case "long":
                    printMinMaxLong();
                    break;
                case "float":
                    printMinMaxFloat();
                    break;
                case "double":
                    printMinMaxDouble();
                    break;
                default:
                    System.out.println("Неверный тип: " + arg);
            }
        }
        if (args.length == 0) {
            printAllMinMaxValues();
        }
    }

    private static void printMinMaxByte() {
        System.out.println("Минимальное значение byte: " + Byte.MIN_VALUE);
        System.out.println("Максимальное значение byte: " + Byte.MAX_VALUE);
    }

    private static void printMinMaxShort() {
        System.out.println("Минимальное значение short: " + Short.MIN_VALUE);
        System.out.println("Максимальное значение short: " + Short.MAX_VALUE);
    }

    private static void printMinMaxChar() {
        System.out.println("Минимальное значение char: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальное значение char: " + (int) Character.MAX_VALUE);
    }

    private static void printMinMaxInt() {
        System.out.println("Минимальное значение int: " + Integer.MIN_VALUE);
        System.out.println("Максимальное значение int: " + Integer.MAX_VALUE);
    }

    private static void printMinMaxLong() {
        System.out.println("Минимальное значение long: " + Long.MIN_VALUE);
        System.out.println("Максимальное значение long: " + Long.MAX_VALUE);
    }

    private static void printMinMaxFloat() {
        System.out.println("Минимальное значение float: " + Float.MIN_VALUE);
        System.out.println("Максимальное значение float: " + Float.MAX_VALUE);
    }

    private static void printMinMaxDouble() {
        System.out.println("Минимальное значение double: " + Double.MIN_VALUE);
        System.out.println("Максимальное значение double: " + Double.MAX_VALUE);
    }

    private static void printAllMinMaxValues() {
        printMinMaxByte();
        printMinMaxShort();
        printMinMaxChar();
        printMinMaxInt();
        printMinMaxLong();
        printMinMaxFloat();
        printMinMaxDouble();
    }
}

