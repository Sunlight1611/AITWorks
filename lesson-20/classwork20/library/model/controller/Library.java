package classwork20.library.model.controller;

import classwork20.library.model.Book;

public class Library {
    //fields
    //array for books
    private Book[] books;
    // number of books in library
    private int size;

    public Library(int capacity) {  // constructor
        this.books = new Book[capacity];
        this.size = 0;
    }

    //methods
    //addBook
    public boolean addBook(Book book) {
        //необходимо в массив добавить элемент
        //предусмотреть, что не добавляется null,
        // не добавляется дубликат,
        // нельзя привысить вместимость библиотеки
        if (book == null || size == books.length || findBook(book.getIsbn()) != null){
            return false;
        }
        books[size] = book;// size - это индекс книжки, которой нет в массиве, size - 1 - это последний индекс в массиве который есть
        size++;
        return true;

    }

    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];

            }
        }
        return null;
    }
    //print books
     public void printBooks(){
         for (int i = 0; i < size; i++) {
             System.out.println(books[i]);

         }
         System.out.println("--------------------");
     }
     //получение количества книг в библиотеке
    public int getSize() {
        return size;
    }
    public Book removeBook(long isbn){
        //найдём жертву, удаляемую жертву
        Book victim = null;
        //ищем книгу по isbn
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                victim = books[i];
                //на её место поставим книгу из имеющего в массиве
                books[i] = books[size - 1]; //на место i книги поставили последнюю
                books[-1] = null;
                size--;
                break;
            }
        }
        // return удаляемую книгу
        return victim;

    }
}