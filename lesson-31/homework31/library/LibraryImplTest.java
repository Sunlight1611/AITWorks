package homework31.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] book;
    @BeforeEach
    void setUp(){
        library = new LibraryImpl(5);
        book = new Book[5];
        book[0] = new Book(501_123_456_789L,"Sally Thorne","The Hating Game",2016);
        book[1] = new Book(502_235_568_412L,"Collen Hoover","Ugly Love",2014);
        book[2] = new Book(515_123_456_789L,"Lois Lowry","Hüter der Erinnerung",2014);
        book[3] = new Book(812_123_856_942L,"Holly Black","Elfen Thron",2021);
        for (Book b: book) {
            library.addBook(b);
        }
        book[4] = new Book(458_101_232_564L,"Natasha Ngan","Girls of Paper and Fire",2018);
    }

    @Test
    void addBook(){
        //не можем добавить null
        assertFalse(library.addBook(null));

        //не можем добавить второй раз, уже существующую книгу
        assertFalse(library.addBook(book[1]));
        Book book1 = new Book(231_452_111_726L,"Sally Rooney","Normale People",2018);//новая книга

        assertTrue(library.addBook(book1));//добавили новую книгу
        assertEquals(5,library.quantity());//сейчас в библиотеке 5 книги
        //создаём ещё одну новую книгу
        Book book2 = new Book(561_402_365_161L,"Madeline Miller","The song of Achilles",2011);//создали новую книгу
        assertFalse(library.addBook(book2));
        //не можем превысить capacity
    }

    @Test
    void removeBook(){
        //удаляем книгу
        assertEquals(book[0],library.removeBook(501_123_456_789L));
        //проверка книги после удаления
        assertEquals(3, library.quantity());
        //проверка повторным поиском, что не возможно найти после удаления - возврат null
        assertNull(library.removeBook(501_123_456_789L));
    }

    @Test
    void findBook(){
        //ищем книгу по isbn
        assertEquals(book[2],library.findBook(515_123_456_789L));
        //ищем несуществующую книгу
        assertNull(library.findBook(444_333_111_222L));
    }

    @Test
    void quantity(){
        assertEquals(4, library.quantity());
    }
}

