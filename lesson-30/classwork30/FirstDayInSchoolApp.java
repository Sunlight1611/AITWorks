package classwork30;

public class FirstDayInSchoolApp {
    public static void main(String[] args) {
        System.out.println("Мальчик Петя пришел на урок впервые. " +
                "Занятие началось и учитель поприветствовал класс");

        System.out.println("И тут он говорит");
        Greeting speach = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Здорово мужики");


            }

            @Override
            public void sayGoodBye() {
                System.out.println("Будьте здоровы");

            }
        };
        speach.sayHello();
        speach.sayGoodBye();

        System.out.println("И этим история закончилась..");
    }
}
