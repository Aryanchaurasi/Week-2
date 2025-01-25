package Day06.EcommercePlatform;

public class Main {
    public static void main(String[] args) {
        //Created the object of Product class
        Product[] products = {
                new Electronics("E001", "Laptop", 1000),
                new Clothing("C001", "T-Shirt", 50),
                new Groceries("G001", "Apple", 2)
        };

        for (Product product : products)
        {
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}
