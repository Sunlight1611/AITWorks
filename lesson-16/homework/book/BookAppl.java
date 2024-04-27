package homework.book;

import homework.book.model.BookA;

public class BookAppl {

    public static void main(String[] args) {

        BookA book = new BookA("War and peace", "Tolstoy", 1980, 1000L);
        book.display();
        System.out.println("----------------------------------------");
    }
}