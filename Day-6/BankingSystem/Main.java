package Day06.BankingSystem;

public class Main {
    public static void main(String[] args)
    {

        BankAccount savings = new SavingsAccount("12345", "John Doe", 1000);
        BankAccount current = new CurrentAccount("67890", "Jane Doe", 2000);
        //Calculated the interest in both type of account
        savings.calculateInterest();
        current.calculateInterest();
        //Printed the balance of both the account type
        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());
        //created the object of loan account
        LoanAccount loanAccount = new LoanAccount("11223", "Alice", 5000);
        loanAccount.applyForLoan(1000);
        //Printed the eligibility of the loan account
        System.out.println("Loan Eligibility: " + loanAccount.calculateLoanEligibility());
    }
}
