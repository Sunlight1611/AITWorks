package homework39;

import java.util.ArrayList;
import java.util.List;


public class RandomNumber {
    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<>();

        int b = 10;
        int a = 1;
        int n = 0;

        // заполнение
        for (int i = 0; i < 20; i++) {
            n = (int)(Math.random()* (b - a + 1) + a);
            randomNumbers.add(n);
        }
        // печать
        for (Integer num : randomNumbers) {
            System.out.print(num + " | ");
        }

        // удаление дубликатов


    }
}

