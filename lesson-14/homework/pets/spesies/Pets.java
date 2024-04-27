package homework.pets.spesies;
//id
//вид
//возраст
//кличка
//спать
//есть
//делать звук
//играть
//гулять
public class Pets {
    private int id;
    private String spesies;
    private int age;
    private String name;

    public Pets(String id, String spesies, int age, String name) {
        this.id = Integer.parseInt(id);
        this.spesies = spesies;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpesies() {
        return spesies;
    }

    public void setSpesies(String spesies) {
        this.spesies = spesies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void movePet(){
        System.out.println("Description of Pets....");
    }
    public void displayPets(){
        System.out.println("Id: " + id + "Spesies: " + spesies + "Age: " + age + "Name: " + name);
    }

    public void sleep() {
        System.out.println("Pet is sleeping...");
    }

    public void walk() {
        System.out.println("Pet is walking...");
    }

    public void eat() {
        System.out.println("Pet is eating...");

    }

    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", spesies='" + spesies + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
