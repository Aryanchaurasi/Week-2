package Day06.LibraryManagementSystem;

public class Main {
    public static void main(String[] args)
    {
        //Created the objects of classes
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various Authors");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        System.out.println(book.getItemDetails());
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");
        System.out.println("Available: " + ((Reservable) book).checkAvailability());

        ((Reservable) book).reserveItem("John Doe");
        System.out.println("Available after reservation: " + ((Reservable) book).checkAvailability());
    }
}
