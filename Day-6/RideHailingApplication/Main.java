package Day06.RideHailingApplication;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("C123", "John Doe", 10.0);
        Vehicle bike = new Bike("B456", "Jane Doe", 5.0);
        Vehicle auto = new Auto("A789", "Jim Doe", 7.0);

        System.out.println(car.getVehicleDetails());
        System.out.println("Fare for 10 km: " + car.calculateFare(10));

        System.out.println(bike.getVehicleDetails());
        System.out.println("Fare for 10 km: " + bike.calculateFare(10));

        System.out.println(auto.getVehicleDetails());
        System.out.println("Fare for 10 km: " + auto.calculateFare(10));
    }
}
