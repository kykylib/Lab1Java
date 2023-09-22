package liberman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTests {

    private Library library;

    @BeforeEach
    public void setUp(){
        library = new Library();
    }

    @Test
    public void testAddition(){
        Book book = new Book("A TIME TO KILL", "JOHN GRISHAM", 9780307392527l, new Date(1989));
        library.addBookToTheLibrary(book);
        assertEquals(book,library.getListOfBook().get(0));
    }
    @Test
    public void testSearching(){
        Book book = new Book("A TIME TO KILL", "JOHN GRISHAM", 9780307392527l, new Date(1989));
        library.addBookToTheLibrary(book);
        assertEquals(book,library.searchBookByName("a time to kill"));
    }
}
