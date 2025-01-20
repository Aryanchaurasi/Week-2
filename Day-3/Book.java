public class Book
{
    static  final String libraryName="Aryan's Library";
    String title,author;
    final int isbn;
    Book(String title ,String author,int isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    void displayLibraryName()
    {
        System.out.println("Welcome to "+libraryName);
    }
    void getdata()
    {
        System.out.println("The isbn code is "+isbn+" for the book "+title+" with the author "+author);
    }
    public static void main(String [] args)
    {
        Book b=new Book("The life of aryan","Aryan",001);
        b.displayLibraryName();
        b.getdata();

    }


}