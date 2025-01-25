package Day06.LibraryManagementSystem;
//Created the abstract class Library Item
abstract class LibraryItem
{
    private String itemId;
    private String title;
    private String author;
    //Constructor for Library item
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    //getter method for item id
    public String getItemId() {
        return itemId;
    }
    //Getter method for title
    public String getTitle() {
        return title;
    }
    //Getter method for author
    public String getAuthor() {
        return author;
    }
    //getter method for item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
//Abstract method for getting loan duration
    public abstract int getLoanDuration();
}
