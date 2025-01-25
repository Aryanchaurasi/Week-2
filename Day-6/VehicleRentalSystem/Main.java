package Day06.VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("CAR123", 50, "CARINS123"),
                new Bike("BIKE123", 20, "BIKEINS123"),
                new Truck("TRUCK123", 100, "TRUCKINS123")
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
