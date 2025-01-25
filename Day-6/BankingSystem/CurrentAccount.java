package Day06.BankingSystem;
//Created the current account class which Extends bank Account
class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02;
    //Constructor for current account class
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    //Overriding the Calculate interest method
    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest);
    }
}
