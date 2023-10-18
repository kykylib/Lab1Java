package liberman;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String ID;
    private List<Item> borrowedItems = new ArrayList<>();

    public Patron(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public void borrow(Item item){
        if(item.isBorrowed()){
            return;
        }
        item.setBorrowed(true);
        borrowedItems.add(item);
    }
    public void borrowReturn(Item item){
        if(item.isBorrowed()){
            item.setBorrowed(false);
            borrowedItems.remove(item);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

}
