package Day06.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args)
    {
        //Created the object of the classes
        Employee emp1 = new FullTimeEmployee(1, "John Doe", 50000, 20000);
        Employee emp2 = new PartTimeEmployee(2, "Jane Smith", 30000, 20, 100);
        //Called the display function using the display details method
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
