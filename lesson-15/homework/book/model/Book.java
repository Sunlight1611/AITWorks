package homework.book.model;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    // Конструктор для инициализации всех полей
    public Book(String isbn, String title, String author, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    // Конструктор для инициализации полей при отсутствии автора
    public Book(String isbn, String title, int yearOfPublishing) {
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    // Геттеры и сеттеры
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = String.valueOf(isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    // Метод для печати информации о книге
    public void display() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + (author != null ? author : "Unknown"));
        System.out.println("Year of Publishing: " + yearOfPublishing);

    }
}

