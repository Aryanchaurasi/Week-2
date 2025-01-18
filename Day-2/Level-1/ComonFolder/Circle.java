import java.util.Scanner;
class Circle
{
    
    double radius;
    //Parameterised Constructor
    Circle(double radius )
    {

        this.radius=radius;
    }
    //Default Constructor
    Circle()
    {
        
        radius=10.2;

    }
    void perimeter()//Method for Perimeter Program
    {
        double perimeter=2*3.14*radius;
        System.out.println("The perimeter is "+perimeter);
    }
    void display()
    {
        System.out.println("The value of radius is  "+radius);
    }
    public static void main(String [] args)
    {
        Circle c=new Circle();
        System.out.println("Called the default constructer");
        c.display();//called the display method fron default constructor
        c.perimeter();
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        Circle c1=new Circle(radius);
        System.out.println("Called the parameterised constructor");
        c1.display();//called the display method fron Parameterised constructor
        c1.perimeter();
    }


}