package Day06.BankingSystem;
//Created an interface names Loanable
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}