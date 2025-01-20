public class Employee
{
    static  final String CompanyName="Capgemini";
    static int count=0;
    String name ,designation;
    final int id;
    Employee(String name ,String designation,int id)
    {
        this.name=name;
        this.designation=designation;
        this.id=id;
        count ++;
    }
    void getTotalEmplloyee()
    {
        System.out.println("There are "+count+" employees in the company");
    }
    void getdata()
    {
        System.out.println("The Employee name is "+ name+" with the post "+designation+" and his id is "+ id);
    }


    public static void main(String [] args)
    {
        Employee e=new Employee("Aryan","Software Engineer",1200312);
        if(e instanceof Employee)
        {
            System.out.println("Yes the e is instance of Book");
        }
        else {
            System.out.println("No e is not instance of Book");
        }
        e.getTotalEmplloyee();
        e.getdata();
    }


}