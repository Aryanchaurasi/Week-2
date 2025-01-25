package Day06.OnlineFoodDeliverySystem;
//Created the class order
class Order implements Discountable {
    private FoodItem foodItem;
    private double discountPercentage;
//Constructor for order class
    public Order(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "%";
    }

    public double getTotalPrice() {
        double totalPrice = foodItem.calculateTotalPrice();
        return totalPrice - (totalPrice * discountPercentage / 100);
    }

    public String getOrderDetails() {
        return foodItem.getItemDetails() + ", " + getDiscountDetails() + ", Total Price: " + getTotalPrice();
    }
}
