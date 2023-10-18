package liberman;

import java.util.Date;

public class Book extends Item{
    private static int counterId = 1;
    private String author;

    public Book(String title, String author) {
        super(title, String.valueOf(counterId++));
        this.author = author;
    }

    @Override
    public void borrowItem() {
        this.setBorrowed(true);
    }

    @Override
    public void returnItem() {
        this.setBorrowed(false);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author  +
                "title=" + this.getTitle() +
                "uniqueID=" + this.getUniqueID() +
                "isBorrowed=" + this.isBorrowed() +
                '}';
    }
}
