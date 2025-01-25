package Day06.EmployeeManagementSystem;
//Created a class names FullTimeEmployee
public class FullTimeEmployee extends Employee
{
    private double fixedSalary;
    //Constructor for Full time Employee class
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }
    ////Overrided the method to calculate sallary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }
}
