package Day06.LibraryManagementSystem;
//Class DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrower;
    //Constructor for DVD class
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
//Overrided the method
    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan duration for DVDs
    }
//Overrided the method
    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.borrower = borrower;
            isReserved = true;
        }
    }
//Overrided the method
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}