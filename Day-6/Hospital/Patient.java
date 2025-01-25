package Day06.Hospital;
//Abstract class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory;
    //Constructor for patient class
    public Patient(String patientId, String name, int age, String diagnosis, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
    }
//Getter method for patient id
    public String getPatientId() {
        return patientId;
    }
//Getter method for patient name
    public String getName() {
        return name;
    }
//Getter method for patient age
    public int getAge() {
        return age;
    }
//Getter method for get the diagnosis detail
    public String getDiagnosis() {
        return diagnosis;
    }
//Getter method for getting medical History
    public String getMedicalHistory() {
        return medicalHistory;
    }
//Getter method for Patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}
