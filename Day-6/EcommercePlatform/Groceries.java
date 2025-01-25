package Day06.EcommercePlatform;
//Class  Groceries
class Groceries extends Product
{
    //Constructor for the class Groceries
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }
    //Overrided the method to calculate the discount on Groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}