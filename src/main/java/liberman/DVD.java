package liberman;

public class DVD extends Item{
    private static int counterId = 1;
    private int duration;

    public DVD(String title, int duration) {
        super(title, String.valueOf(counterId++));
        this.duration = duration;
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
        return "DVD{" +
                "duration=" + duration +
                "title=" + this.getTitle() +
                "uniqueID=" + this.getUniqueID() +
                "isBorrowed=" + this.isBorrowed() +
                '}';
    }
}
