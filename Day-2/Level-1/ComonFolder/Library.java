public class Library{
    String BookName;
    String Author;
    int BookNos;

    // Default constructor
    public Library() 
    {
        BookName="The Rich man";
        BookNos=19;
        Author="Aryan";
    }

    // Parameterized constructor
    public Library(String   BookName, int BookNos, String Author) {
        this.BookName = BookName;
        this.Author = Author;
        this.BookNos = BookNos;
    }

    // Copy constructor
    public Library(Library other) {
        this.BookName = other.BookName;
        this.Author = other.Author;
        this.BookNos = other.BookNos;
    }
    
    
    public void display() {
        System.out.println( "Book  name='" + BookName + " and  author " + Author + " in Library with the quantity of  =  " + BookNos );
    }

    // Main method to demonstrate the copy constructor
    public static void main(String[] args) 
    {
        Library original = new Library("The Rich man", 20, "Aryan");
        Library clone = new Library(original);
        System.out.println("this is the orignal parameterised constructor");
        original.display();
        System.out.println("this is the clone of  parameterised constructor or copy constructor");
        clone.display();
    }
}
