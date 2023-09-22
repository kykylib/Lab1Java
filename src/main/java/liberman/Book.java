package liberman;

import java.util.Date;

public class Book {
    private String nameOfBook;
    private String author;
    private long numberISBN;
    private Date year;

    public Book(String nameOfBook, String author, long numberISBN, Date year) {
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

    public long getNumberISBN() {
        return numberISBN;
    }

    public Date getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", author='" + author + '\'' +
                ", numberISBN=" + numberISBN +
                ", year=" + year +
                '}';
    }
}
