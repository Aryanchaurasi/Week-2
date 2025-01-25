package Day06.OnlineFoodDeliverySystem;
//Abstracr class Food item
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    //Constructor for food item
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    //getter method for item name
    public String getItemName() {
        return itemName;
    }
    //getter method for getting price
    public double getPrice() {
        return price;
    }
    //Getter method for getting the quantity
    public int getQuantity() {
        return quantity;
    }
    //Setter method for Setting Quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //Getter method for getting item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}