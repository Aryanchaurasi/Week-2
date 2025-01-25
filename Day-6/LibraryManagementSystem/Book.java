package Day06.LibraryManagementSystem;
//Create the class Book
class Book extends LibraryItem implements Reservable
{

    private boolean isReserved;
    private String borrower;
    //Constructor for book class
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }
    //overrided the method to get the loan duration
    @Override
    public int getLoanDuration() {
        return 21; // 21 days loan duration for books
    }
    //overrided the method to reserve item
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