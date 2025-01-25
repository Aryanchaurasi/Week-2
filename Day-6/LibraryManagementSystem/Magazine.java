package Day06.LibraryManagementSystem;
//Class Magazine
class Magazine extends LibraryItem implements Reservable
{

    private boolean isReserved;
    private String borrower;
    //Constructor for Magazine
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    //Overrided the method to get loan Duration
    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan duration for magazines
    }
    //Overrided the methof to reserve item
    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.borrower = borrower;
            isReserved = true;
        }
    }
    //overrided the method to check the availability
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
