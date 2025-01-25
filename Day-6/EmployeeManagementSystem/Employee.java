package Day06.EmployeeManagementSystem;
//Created abstract class named Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    //constructor for employee class
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    //Getter method for Employee
    public int getEmployeeId() {
        return employeeId;
    }
    //Setter method for employee
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    //Getter method for Name
    public String getName() {
        return name;
    }
    //setter method for name
    public void setName(String name) {
        this.name = name;
    }
    //Getter method for base sallary
    public double getBaseSalary() {
        return baseSalary;
    }
    //Setter method for Base sallaey
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    //Calculated the sallary with abstract method
    public abstract double calculateSalary();
    //Displayed various details of employee
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
