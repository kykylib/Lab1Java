package liberman;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> listOfBook = new ArrayList<>();

    public void addBookToTheLibrary(Book book){
        listOfBook.add(book);
    }
    public void addBooksToTheLibrary(List<Book> listOfBookToAdd){
        listOfBook.addAll(listOfBookToAdd);
    }
    public void showLibrary(){
        for (Book book : listOfBook) {
            System.out.println(book);
        }
    }

    public Book searchBookByName(String nameOfBook){
        Book foundBook = listOfBook.stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(nameOfBook))
                    .findFirst()
                    .orElse(null);
        if(foundBook == null) {
            System.out.println("Book not found");
            return foundBook;
        }
        System.out.println(foundBook);
        return foundBook;
    }

    public List<Book> getListOfBook() {
        return listOfBook;
    }
}
