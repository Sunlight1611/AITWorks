package homework;

//Величина 3-го угла треугольника по известным первым двум.
public class Triangle {
    public static void main(String[] args) {

        System.out.println("Значение первого угла");
        int angle1 = (90);
        System.out.println("Значение второго угла");
        int angle2 = (60);
        int angle3 = 180 - angle1 - angle2;

        System.out.println("Третий угол треугольника" + angle3 + "градусов");

    }
}
