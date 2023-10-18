package liberman;

import java.util.ArrayList;
import java.util.List;


public class Library implements IManageable {
    private List<Item> itemList = new ArrayList<>();
    private List<Patron> patronList = new ArrayList<>();

    public void registerPatron(Patron patron){
        boolean havePatron = patronList.contains(patron);
        if(havePatron){
            System.out.println("Patron already have");
            return;
        }
        patronList.add(patron);
    }

    public void lendItem(Patron patron,Item item){
        if(patronList.contains(patron))
        {
            List<Item> availableItems = listAvailable();
            if(availableItems.contains(item))
            {
                patron.borrow(item);
                item.setBorrowed(true);
            }
        }
    }

    public void returnItem(Patron patron, Item item){
        if(patronList.contains(patron))
        {
            List<Item> borrowedItems = listBorrowed();
            if(borrowedItems.contains(item))
            {
                patron.borrowReturn(item);
                item.setBorrowed(false);
            }
        }
    }

    @Override
    public void add(Item item) {
        boolean containsItem = itemList.contains(item);
        if(containsItem){
            System.out.println("Item already have");
            return;
        }
        itemList.add(item);
    }

    @Override
    public void remove(Item item) {
        boolean containsItem = itemList.contains(item);
        if(containsItem){
            itemList.remove(item);
            return;
        }
        System.out.println("Item not found");
    }

    @Override
    public List<Item> listAvailable() {
        return itemList.stream()
                .filter(item -> !item.isBorrowed())
                .toList();
    }

    @Override
    public List<Item> listBorrowed() {
        return itemList.stream()
                .filter(item -> item.isBorrowed())
                .toList();
    }
}
