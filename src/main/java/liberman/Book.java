package liberman;

import java.util.Date;

public class Book {
    private String nameOfBook;
    private String author;
    private int numberISBN;
    private Date year;

    public Book(String nameOfBook, String author, int numberISBN, Date year) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.numberISBN = numberISBN;
        this.year = year;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberISBN() {
        return numberISBN;
    }

    public Date getYear() {
        return year;
    }
}
