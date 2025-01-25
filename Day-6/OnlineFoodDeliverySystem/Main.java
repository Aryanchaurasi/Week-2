package Day06.OnlineFoodDeliverySystem;

public class Main {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Tikka", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Curry", 300, 1);

        Order vegOrder = new Order(vegItem);
        vegOrder.applyDiscount(10);
        System.out.println(vegOrder.getOrderDetails());

        Order nonVegOrder = new Order(nonVegItem);
        nonVegOrder.applyDiscount(5);
        System.out.println(nonVegOrder.getOrderDetails());
    }
}