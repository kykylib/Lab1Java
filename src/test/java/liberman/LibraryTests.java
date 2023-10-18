package liberman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTests {

    @Test
    public void testBorrowAndReturnBook() {
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger");
        assertFalse(book.isBorrowed());

        book.borrowItem();
        assertTrue(book.isBorrowed());

        book.returnItem();
        assertFalse(book.isBorrowed());
    }

    @Test
    public void testBorrowAndReturnDVD() {
        DVD dvd = new DVD("Inception", 126);
        assertFalse(dvd.isBorrowed());

        dvd.borrowItem();
        assertTrue(dvd.isBorrowed());

        dvd.returnItem();
        assertFalse(dvd.isBorrowed());
    }

    @Test
    public void testBorrowAndReturnPatron() {
        Patron patron = new Patron("John Doe");
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");

        patron.borrow(book);
        assertTrue(patron.getBorrowedItems().contains(book));

        patron.borrowReturn(book);
        assertFalse(patron.getBorrowedItems().contains(book));
    }

    @Test
    public void testLendAndReturnItemInLibrary() {
        Library library = new Library();
        Patron patron = new Patron("Jane Smith");
        Book book = new Book("1984", "George Orwell");

        library.registerPatron(patron);
        library.add(book);

        assertFalse(patron.getBorrowedItems().contains(book));

        library.lendItem(patron, book);
        assertTrue(patron.getBorrowedItems().contains(book));

        library.returnItem(patron, book);
        assertFalse(patron.getBorrowedItems().contains(book));
    }
}
