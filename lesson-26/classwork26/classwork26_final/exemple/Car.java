package classwork26.classwork26_final.exemple;

public class Car {
    public String vendor;
    public int builtYear;

    public Car(String vendor, int builtYear) {
        this.vendor = vendor;
        this.builtYear = builtYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", builtYear=" + builtYear +
                '}';
    }

    public static class Main2 {
        public static void main(String[] args) {
            final String name = "qwerty";
          //  name = "abcde";
            // Вызывает ошибку, мы не можем определять переменную
            System.out.println(name);
        }
    }
}
