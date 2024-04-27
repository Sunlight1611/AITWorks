package homework;
//Распечатайте все натуральные числа меньшие 200 и кратные 13.
public class IntergesOf13 {
    public static void main(String[] args) {
        for (int i = 1; i < 200; i++) {
            if (i % 13 == 0) {
                System.out.println(i);
            }
        }
    }
}

