package Day06.OnlineFoodDeliverySystem;
//Class for Non Veg Items
class NonVegItem extends FoodItem {
    private static final double ADDITIONAL_CHARGE = 1.5;
    //Constructor for NonVegItem
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
//Overrided rhe Calculate total price method
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * ADDITIONAL_CHARGE) * getQuantity();
    }
}
