package classwork30;

public class AnonymousExampleApp {
    public static void main(String[] args) {
        //создание анонимного класса
        //1.нельзя будет создать второй объект с там же поведением
        //2.вы получите объект с типом интерфейса
        Greeting myObject = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class");

            }
            @Override
            public void sayGoodBye(){
                System.out.println("Good bye from anonymous class");
            }
        };
        myObject.sayHello();
        myObject.sayGoodBye();
    }
}
