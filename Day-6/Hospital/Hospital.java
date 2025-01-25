package Day06.Hospital;

import java.util.ArrayList;
import java.util.List;
//Created a hospital class
class Hospital
{
    //Created the list of doctor and patient
    private List<Doctor> doctors;
    private List<Patient> patients;
    //Constructor for Hospital class
    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    //Created the method to add doctor to the list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    //Created the method to add patient to patient class
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    //Created the method to assignt the patient to doctor

    public void assignPatientToDoctor(String doctorId, Patient patient) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId().equals(doctorId)) {
                doctor.assignPatient(patient);
                addPatient(patient);
                break;
            }
        }
    }
    //Getter method fot doctor's data
    public List<Doctor> getDoctors() {
        return doctors;
    }
    //Getter method for Patient's data
    public List<Patient> getPatients() {
        return patients;
    }
}