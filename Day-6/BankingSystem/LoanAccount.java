package Day06.BankingSystem;
//Created a class named Loan account
class LoanAccount extends BankAccount implements Loanable {
    private double loanAmount;

    public LoanAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    //Overriding the method named Apply for loan

    @Override
    public void applyForLoan(double amount) {
        loanAmount = amount;
    }
    //Overriding the method named CalculateloanEligibility
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= loanAmount * 0.2;
    }
    //Overriding the method named Calculate Interest
    @Override
    public void calculateInterest() {
        // Loan accounts may have different interest calculations
    }
}
