package Day06.Hospital;

// Subclass InPatient
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;
    //Constructor for InPatient
    public InPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, diagnosis, medicalHistory);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }
    //Overrided the method to calculate bill
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }
}
