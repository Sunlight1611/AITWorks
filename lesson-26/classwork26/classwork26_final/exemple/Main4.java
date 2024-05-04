package classwork26.classwork26_final.exemple;

public class Main4 {
    public static void main(String[] args) {
        //так дельзя нельзя, final переменные обычные должны быть неизменяемыми
        final double[] values ={3.14};
        //Values ={}; вызовет ошибку
        //нельзя переопределить переменную values
        values[0] = 2;// меняем данные в уже существующем массиве, но не переопределяем переменную
        System.out.println("Площадь окружности с радиусом 2: " + values[0] * 4);
    }
}
