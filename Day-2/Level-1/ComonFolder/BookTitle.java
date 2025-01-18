class BookTitle
{
    String  title;
    String author;
    double price;
    BookTitle(String  title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    BookTitle()
    {
        title="title";
        author="author";
        price=200.90;
    }
    void display()
    {
        System.out.println("The author name is "+author+ " Book name is "+title+"and the price is "+price);
    }
    public static void main(String [] args)
    {
        BookTitle bt=new BookTitle();
        System.out.println("Called the default constructer");
        bt.display();
        BookTitle bt1=new BookTitle("The book atory","Aryan",90);
        System.out.println("Called the parameterised constructor");
        bt1.display();
    }


}