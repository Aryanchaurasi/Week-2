package Day06.EcommercePlatform;
//Created class clothing
class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }
    //Overrided the method calculate discount and calculated the discount on cloth
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }
    //Overrided the method calculate tax and calculated the tax for cloth
    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }
    //Overrided the getter method of getting the tax
    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}