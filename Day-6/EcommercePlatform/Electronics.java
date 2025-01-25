package Day06.EcommercePlatform;
//Creatd a class named electronics
class Electronics extends Product implements Taxable
{
    //constructor for Electronics
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }
    //Overrided the method calculateDiscount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }
    //Overrided the method to calculate tax for Electronics
    @Override
    public double calculateTax() {
        return getPrice() * 0.15; // 15% tax
    }
    //Overrided the method to get tax details
    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 15%";
    }
}
