package homework30.cook;

public class CookApp {
    public static void main(String[] args) throws InterruptedException {
        Cook cook = new Cook() {
            @Override
            public void cook() {
                System.out.println("Повар готовит еду");

            }

            };

        Prepare prepare = new Prepare("Повар будет готовить");
        prepare.cooking(cook);
    }
}
