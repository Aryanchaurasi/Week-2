package Day06.Hospital;

import java.util.ArrayList;
import java.util.List;
//Doctor class
class Doctor
{
    private String doctorId;
    private String name;
    private List<Patient> patients;
    //Constructor for Doctor class
    public Doctor(String doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
        this.patients = new ArrayList<>();
    }
    //Created  the method to get the doctor id
    public String getDoctorId() {
        return doctorId;
    }
    //Created the method to get the name
    public String getName() {
        return name;
    }
    //Created the method to assign patient
    public void assignPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }
}