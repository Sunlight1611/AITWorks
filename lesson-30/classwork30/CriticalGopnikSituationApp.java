package classwork30;

public class CriticalGopnikSituationApp {
    public static void main(String[] args) {
        System.out.println("Человек идёт по улице и встречает" + "группу моргинальных личностей");
        System.out.println("И тут он говорит");

        Greeting speach = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здорово мужики");

            }
            @Override
            public void sayGoodBye() {
                System.out.println("Бывайте");

            }
        };
        speach.sayHello();
        speach.sayGoodBye();

        System.out.println("История этим и кончилась...");
    }
}
