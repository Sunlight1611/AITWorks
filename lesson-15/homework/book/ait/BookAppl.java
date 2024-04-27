package homework.book.ait;

import homework.book.model.BookA;

public class BookAppl {
    public static void main(String[] args) {
        // Создаем несколько экземпляров класса Book
        BookA book1 = new BookA(9741234567890L, "Java Programming", "John Doe", 2020);
        BookA book2 = new BookA(9789876523210L, "Python Basics", "Jane Smith", 2019);

        // Выводим информацию о каждой книге
        System.out.println("Book 1:");
        book1.display();

        System.out.println("Book 2:");
        book2.display();


    }
}

