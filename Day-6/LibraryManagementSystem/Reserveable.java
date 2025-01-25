package Day06.LibraryManagementSystem;
//Created a interface named reservable
interface Reservable
{
    void reserveItem(String borrower);
    boolean checkAvailability();
}
