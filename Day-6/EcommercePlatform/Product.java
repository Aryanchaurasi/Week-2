package Day06.EcommercePlatform;
//Created a Abstraact class Prpduct
abstract class Product {
    private String productId;
    private String name;
    private double price;
    //Constructor for Product class
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    //Getter method for product id
    public String getProductId() {
        return productId;
    }
    //Getter method for product name
    public String getName() {
        return name;
    }
    //getter method for product price
    public double getPrice() {
        return price;
    }
//setter method for product price
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
}
