import java.util.*;
class Student
{
    //create the three varible title, author and price
    String studentName;
    int rollNo;
    int physics,chemistry,math;

    Student(String studentName, int rollNo,  int physics,int chemistry,int math)//make default constructor and initialize to this keyword
    {
        this.studentName =studentName;
        this.rollNo=rollNo;
        this.physics=physics;
        this.chemistry=chemistry;
        this.math=math;
    }

    void getdata()  //create method book detail and print the all detail
    {
        int percentage=(physics+chemistry+math)/3;
        System.out.println(percentage);
        if(percentage>=90)
        {
            System.out.println("Student name :"+ studentName);
            System.out.println("Student Roll Number :"+rollNo);
            System.out.println("Student grade is A");
        }
        else if(percentage>=80)
        {
            System.out.println("Student name :"+ studentName);
            System.out.println("Student Roll Number :"+rollNo);
            System.out.println("Student grade is B");
        }
        else if(percentage>60)
        {
            System.out.println("Student name :"+ studentName);
            System.out.println("Student Roll Number :"+rollNo);
            System.out.println("Student grade is C");
        }
        else
        {
            System.out.println("Student name :"+ studentName);
            System.out.println("Student Roll Number :"+rollNo);
            System.out.println("Student grade is D");
        }

    }
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        Student student=new Student("Aryan", 33,70,80,90);
        student.getdata();
    }
}