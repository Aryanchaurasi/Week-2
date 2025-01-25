package Day06.Hospital;
//Subclass OutPatient
class OutPatient extends Patient {
    private double consultationFee;
    //Constructor for OutPatient
    public OutPatient(String patientId, String name, int age, String diagnosis, String medicalHistory, double consultationFee) {
        super(patientId, name, age, diagnosis, medicalHistory);
        this.consultationFee = consultationFee;
    }
//Overrided the method to calculate bill
    @Override
    public double calculateBill() {
        return consultationFee;
    }
}