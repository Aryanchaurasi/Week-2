public class Student
{
    static  final String universityName="Technocrats Institute of technology";
    static int count=0;
    String name ,grade;
    final int rollNo;
    Student(String name ,String grade,int rollNo)
    {
        this.name=name;
        this.grade=grade;
        this.rollNo=rollNo;
        count ++;
    }
    void displayTotalStudent()
    {
        System.out.println("There are "+count+" student in the university");
    }
    void getdata()
    {
        System.out.println("The Student name is "+ name+" with the grade "+grade+" and his roll no. is "+ rollNo);
    }


    public static void main(String [] args)
    {
        Student um=new Student("Aryan","A",211033);
        if(um instanceof Student)
        {
            System.out.println("Yes the um is instance of University management");
        }
        else {
            System.out.println("No um is not instance of University management");
        }
        um.displayTotalStudent();
        um.getdata();
    }


}