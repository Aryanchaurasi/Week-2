package Day06.Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();//Created the object for hospital class

        Doctor doctor1 = new Doctor("D001", "Dr.Aryan");//Created the object for Doctor class
        Doctor doctor2 = new Doctor("D002", "Dr.Deepraj");//created another object for patient class

        hospital.addDoctor(doctor1);//Added the first object to list inside the hospital class
        hospital.addDoctor(doctor2);//Added the second object to the list of doctors in hospital class
        //Created the objects of Patient class
        Patient inPatient = new InPatient("P001", "Ashu", 18, "Flu", "No history", 5, 200.0);
        Patient outPatient = new OutPatient("P002", "Ankit", 19, "Cold", "No history", 150.0);
        //Assigned the Doctors to the patients
        hospital.assignPatientToDoctor("D001", inPatient);
        hospital.assignPatientToDoctor("D002", outPatient);
        //Printed all the assigned data to the display
        System.out.println("Doctors and their patients:");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println("Doctor: " + doctor.getName());
            for (Patient patient : doctor.getPatients()) {
                System.out.println("  " + patient.getPatientDetails() + ", Bill: " + patient.calculateBill());
            }
        }
    }
}