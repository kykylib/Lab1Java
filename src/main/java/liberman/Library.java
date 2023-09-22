package liberman;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Library {
    private List<Book> listOfBook = new ArrayList<>();

    public void addBooksToTheLibrary(Book book){
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

    public void searchBookByName(String nameOfBook){
        Book foundBook = listOfBook.stream()
                    .filter(book -> book.getNameOfBook().equalsIgnoreCase(nameOfBook))
                    .findFirst()
                    .orElse(null);
        if(foundBook == null) {
            System.out.println("Book not found");
            return;
        }
        System.out.println(foundBook);
    }




}
