package liberman;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("ABSALOM, ABSALOM!","WILLIAM FAULKNER",  9780394556345l,new Date(1936));
        Book book2 = new Book("A TIME TO KILL","JOHN GRISHAM",  9780307392527l,new Date(1989));
        Book book3 = new Book("THE HOUSE OF MIRTH","EDITH WHARTON",   9781499219425l,new Date(1905,1,14));
        library.addBooksToTheLibrary(book1);
        library.addBooksToTheLibrary(List.of(book2,book3));
        library.showLibrary();

        library.searchBookByName("a time to kil");

    }
}
