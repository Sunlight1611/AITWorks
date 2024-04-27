package classwork24;

public class StringBuilderExemple {
    public static void main(String[] args) {
        // Создаём обёект StringBuilder
        StringBuilder shoppingList = new StringBuilder();
        // Добавляем пункты в список покупок
        shoppingList.append("Молоко");
        shoppingList.append("Яйца");
        shoppingList.append("Хлеб");
        shoppingList.append("Шоколад");

    //Выведем итоговый список покупок
        System.out.println("Список покупок:" + shoppingList.toString());

    }
}
class StringExample {
    public static void main(String[] args) {
        // Создаем пустую строку
        String shoppingList = "";

        // Добавляем пункты в список покупок
        shoppingList = shoppingList + "Молоко";
        shoppingList = shoppingList + ",Яйца";
        shoppingList = shoppingList + ",Хлеб";
        shoppingList = shoppingList + ",Шоколад";

        // Выводим итоговый список покупок
        System.out.println(
                "Список покупок: " + shoppingList);
    }
}

class StringBuilderExample2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("a");//"a"
        str.append(" cat");
        str.insert(0,"I have ");

        str.delete(7,9);

        int i = str.indexOf("cat");
        str.delete(i,i + 3); // "I have cat"

        int haveIndex = str.indexOf("have");
        str.replace(haveIndex,haveIndex +4,"had");

        str.append("headache");

        System.out.println(str.toString());
        //Создаём новый объект StringBuilder содержащий
        System.out.println(str.reverse().toString());
    }
}






