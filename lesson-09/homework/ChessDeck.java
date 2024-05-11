package homework;

public class ChessDeck {
        public static void main(String[] args) {
            int k = 0;
            int l = 0;

            while (k < 8) {
                while (l < 8) {
                    System.out.print((k + l) % 2 + " | ");
                    l++;
                }
                System.out.println();
                l = 0;
                k++;
            }

            char white = '◻'; // символ
            char black = '◼'; // символ
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(white + "  ");
                    } else {
                        System.out.print(black + "  ");
                    }
                }
                System.out.println();
            }

//        public static void main (String[]args){
//            System.out.println("Таблица квадратов чисел от 1 до 100:");
//            for (int i = 1; i <= 10; i++) { // Внешний цикл для строк
//                for (int j = 1; j <= 10; j++) { // Внутренний цикл для столбцов
//                    int number = (i - 1) * 10 + j; // Вычисляем число для текущей позиции
//                    System.out.print(number * number + "\t"); // Выводим квадрат числа с табуляцией
//                }
//                System.out.println(); // Переходим на новую строку после каждой строки из 10 чисел
//            }
//        }
        }
    }


