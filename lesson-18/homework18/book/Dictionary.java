package homework18.book;

public class Dictionary extends Book {
    private String type;
    private int wordQuantity;

    public Dictionary(String title, String author, int year, long isbn, int pageQuantity, String type, int wordQuantity) {
        super(title, author, year, isbn, pageQuantity);
        this.type = type;
        this.wordQuantity = wordQuantity;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWordQuantity() {
        return wordQuantity;
    }

    public void setWordQuantity(int wordQuantity) {
        this.wordQuantity = wordQuantity;
    }

    @Override
    public String toString() {
        return super.toString() + "Dictionary{" +
                "type='" + type + '\'' +
                ", wordQuantity=" + wordQuantity +
                '}';
    }
}

