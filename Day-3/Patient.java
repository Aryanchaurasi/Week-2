public class Patient
{
    static final String hospitalName="Jeevan jyoti Hospital";
    static int count =0;
    String name,ailment;
    int age;
    final int patientID;
    Patient(String name,int age,String ailment)
    {
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        count++;
        patientID=count;
    }
    void getTotalPatient()
    {
        System.out.println("There are total "+count+" Patient in the Hospital");
    }
    void fetchData()
    {
        System.out.println("The patient name is "+name+" and age is "+age+ " he came to hospital for the cure of "+ailment);
    }
    public static void main(String args [])
    {
        Patient p=new Patient("SOMEONE",29,"Fever");
        if(p instanceof Patient)
        {
            System.out.println("Yes,P is the instance of Patient");
        }
        else {
            System.out.println("No,P is not the instance of Patient");
        }
        p.getTotalPatient();
        p.fetchData();
    }

}