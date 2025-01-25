package Day06.EmployeeManagementSystem;
//Created a class named Part time employee
public class PartTimeEmployee extends Employee
{
    private int workHours;
    private double hourlyRate;
    //Constructor for PartTimeEmployee
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }
    ////Overrided the method to calculate sallary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }
}
