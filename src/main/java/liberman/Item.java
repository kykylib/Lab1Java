package liberman;

public abstract class Item {
    private String title;
    private String uniqueID;
    private boolean isBorrowed = false;

    public Item(String title, String uniqueID) {
        this.title = title;
        this.uniqueID = uniqueID;
    }

    public abstract void borrowItem();
    public abstract void returnItem();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
