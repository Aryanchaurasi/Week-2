package Day06.BankingSystem;

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;//Fixed the value of interest rate as 4%
    //Constructor for saving account
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    //Overriaded the method named calculate interest and calculated the interest for saving account
    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest);
    }
}
