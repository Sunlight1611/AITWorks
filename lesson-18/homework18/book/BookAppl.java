package homework18.book;

public class BookAppl {
    public static void main(String[] args) {

        Book[] books = new Book[6];

        books[0] = new Book("Ugly Love","Colleen Hoover",2014, 9-781-476-753-188,322);
        books[1] = new Book("Normal People","Sally Rooney",2018,9-780-571-334-650,266);
        books[2] = new Book("Elfen Krone","Holly Black",2020,9-783-570-313-589,444);
        books[3] = new Book("The Hating Game","Sally Thorne",2021,9-780-349-414-263,363);
        books[4] = new Dictionary( "Universal Wortebuch Latein","Langenscheidt" , 1998,3-468-182-023,410 , "language", 2800);
        books[5] = new Dictionary("English-Russian and Russian-English dictionary", "M.Dubrovin", 2006, 5-765-702-600, 992, "language", 4500);

        System.out.println("============Books and dictionaries=====");
        printBooks(books);

        System.out.println("==============Total pages===========");
        int totalPages = getTotalPages(books);
        System.out.println("Total pages = " + totalPages);

        System.out.println("==============Total words in dictionaries ===========");
        int totalWords = getTotalWords(books);
        System.out.println("Words in dictionaries = " + totalWords);

        System.out.println("=============Average years of publishing==============");
        double avgEge = getAvgEge(books);
        System.out.println("Average years of publishing = " + avgEge);

    }

    private static double getAvgEge(Book[] books) {
        double avdEge = 0;
        for (int i = 0; i < books.length; i++) {
            avdEge += books[i].getYearOfPublishing();
        }
        return  avdEge / books.length;
    }

    private static int getTotalWords(Book[] books) {
        int res = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i] instanceof Dictionary){
                Dictionary dictionary = (Dictionary) books[i];
                res += dictionary.getWordQuantity();
            }
        }
        return res;
    }


    private static int getTotalPages(Book[] books) {
        int res = 0;
        for (int i = 0; i < books.length; i++) {
            res += books[i].getPageQuantity();
        }
        return res;
    }

    private static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }


}