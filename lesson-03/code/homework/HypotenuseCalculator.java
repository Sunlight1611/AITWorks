package homework;

// *Гипотенузa по двум катетам (теорема Пифагора).
public class HypotenuseCalculator {
    public static void main(String[] args) {

        System.out.println("Длина первого катета");
        double firstCatet =  2;
        System.out.println("Длина второго катета");
        double secondCatet = 2;
        double hypotenuse = Math.sqrt (Math.pow(firstCatet, 2) + Math.pow (secondCatet, 2));

        System.out.println("Длина гипотенузы" +  hypotenuse);
    }
}
