package homework.book.model;

public class BookA {


        private String title;
        private String author;
        private int yaerOfPublishing;
        private long isbn;

        public BookA(String title, String author, int yaerOfPublishing, long isbn) {
            this.title = title;
            this.author = author;
            this.yaerOfPublishing = yaerOfPublishing;
            this.isbn = isbn;
        }

    public BookA(long l, String javaProgramming, String johnDoe, int isbn) {
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

        public int getYaerOfPublishing() {
            return yaerOfPublishing;
        }

        public void setYaerOfPublishing(int yaerOfPublishing) {
            this.yaerOfPublishing = yaerOfPublishing;
        }

        public long getIsbn() {
            return isbn;
        }

        public void setIsbn(long isbn) {
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return "BookA{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", yaerOfPublishing=" + yaerOfPublishing +
                    ", isbn=" + isbn +
                    '}';
        }

        public void display(){
            System.out.println("BookA{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", yaerOfPublishing=" + yaerOfPublishing +
                    ", isbn=" + isbn +
                    '}');
        }
    }

