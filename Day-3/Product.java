public class Product
{
    static double discount=4;
    static int count = 0;
    String productName;
    double price;
    int quantity;
    final int productID;
    Product(String productName,double price,int quantity)
    {
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        count++;
        productID=count;
    }
    void updateDiscount(double newDiscount)
    {
        discount=newDiscount;
    }
    void updatePrice()
    {
        price=price-((price*discount)/100);
    }
    void displayprice()
    {
        System.out.println("The discounted price of "+productName+" is "+price);
    }
    void getDetails()
    {
        System.out.println("The "+ productName +" is in the quantity of "+ quantity+ " and the product id is "+ productID +" With the discounted price of "+price);
    }
    public static void main(String []args)
    {
        Product p = new Product("Tshirt",399.99,200);
        if (p instanceof Product)
        {
            System.out.println("Yes p is the intance of Product");
        }
        else {
            System.out.println("No, p is not the intance of Product");
        }
        p.updateDiscount(3.5);
        p.updatePrice();
        p.displayprice();
        p.getDetails();


    }



}