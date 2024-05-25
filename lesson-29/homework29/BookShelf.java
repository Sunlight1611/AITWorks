package homework29;
import java.util.ArrayList;
import java.util.List;

    class BookShelf {
        @Override
        public String toString() {
            return "BookShelf{" +
                    "books=" + books +
                    '}';
        }

        private List<Book> books = new ArrayList<>();

        static class Book {
            String title;
            String author;
            int year;

            Book(String title, String author, int year) {
                this.title = title;
                this.author = author;
                this.year = year;
            }

            @Override
            public String toString() {
                return title + " by " + author + ", " + year;
            }
        }

        void addBook(String title, String author, int year) {
            this.books.add(new Book(title, author, year));
        }
        Book removeBook(int index){
            return this.books.remove(index);
        }

        class Iterator {
            private int cursor = 0;

            public BookShelf.Book nextBook() {
                // дописать
                // надо взять книжку с полки по индексу
                if (this.cursor == BookShelf.this.books.size()){
                    this.cursor = 0;

                }
                Book book = BookShelf.this.books.get(cursor);
                this.cursor++;
                return book;

                // перемещаем руку библиотекаря на следующую книгу
                // проверяем не вышла ли рука библиотекаря за пределы полки


            }
        }

        // добавить метод toString
    }


    class Main2 {
        public static void main(String[] args) {
            BookShelf bookShelf = new BookShelf();
            bookShelf.addBook("Война и мир", "Лев Толстой", 2024);
            bookShelf.addBook("Война и мир", "Лев Толстой", 2024);
            bookShelf.addBook("Война и мир", "Лев Толстой", 2024);
            bookShelf.addBook("Война и мир", "Лев Толстой", 2024);

        BookShelf.Iterator iterator = bookShelf.new Iterator();

            System.out.println(iterator.nextBook());
            System.out.println(iterator.nextBook());

            // Создать объект внутреннего класса Iterator и вызвать на нем несколько раз метод nextBook
        }
    }


// добавить метод toString в класс BookShelf
// написать метод nextBook в классе Iterator
// заполнить книжную полку в методе main класса classwork30.Main
// создать в методе main класса classwork30.Main объект итератора и вызвать на нем несколько раз метод nextBook

