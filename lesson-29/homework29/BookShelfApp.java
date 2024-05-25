package homework29;

public class BookShelfApp {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("1984","Джорж Оруэлл",1949);
        bookShelf.addBook("Преступление и наказание", "Достоевский",1866);
        bookShelf.addBook("Война и мир","Толстой",1867);

        System.out.println(bookShelf);

        BookShelf.Iterator iterator = bookShelf.new Iterator();


    }
}
