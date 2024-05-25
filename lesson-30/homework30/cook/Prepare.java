package homework30.cook;

public class Prepare {
    private String cook;


    public Prepare(String cook) {
        this.cook = cook;

    }

    public Prepare() {

    }

    @Override
    public String toString() {
        return "Prepare{" +
                "cook='" + cook + '\'' +
                '}';
    }
    public void cooking(Cook cook){
        System.out.println("Повар будет готовить");
        cook.cook();

    }
}
