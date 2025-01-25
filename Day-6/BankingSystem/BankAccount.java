package Day06.BankingSystem;
//Created a Abstract class named Bank account
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    //Constructor of BanKAccount class
    public BankAccount(String accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    //Getter method for Account number
    public String getAccountNumber() {
        return accountNumber;
    }
    //Getter method for Holder name
    public String getHolderName() {
        return holderName;
    }
    //Getter method for Balance
    public double getBalance() {
        return balance;
    }
    //Method for deposit into the accout
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)//Checking weather the withdrwl amount is greater than bank balance
        {
            balance -= amount;
        }
    }

    public abstract void calculateInterest();
}