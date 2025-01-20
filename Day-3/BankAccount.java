public class BankAccount
{
    public static final String bankName="Aryan Associative Bank";
    static int count =0;
    private String accHolderName;
    static final  int accountNumber=count;
    private double balance=0;
    BankAccount(String accHolderName,int balance)
    {
        count++;
        this.accHolderName=accHolderName;
        setbalance(balance);
    }
    private void setbalance(int money)
    {
        balance=balance+money;
    }
    void getData()
    {
        System.out.println("The person named "+accHolderName+" with account number "+accountNumber+" has total "+balance+" in his bank account");
    }
    public static void getTotalAccount()
    {
        System.out.println("There are total "+count+" Accounts in bank");
    }

    public void withdraw(int money)
    {
        if(money>balance)
        {
            System.out.println("Not enough amount");
        }
        else {
            System.out.println("Money Withdrawn Successfully");
            balance=balance-money;
        }
    }
    public void deposit(int money)
    {
        System.out.println("Money Deposited Successfully");
        balance=balance+money;
    }
    public void checkBalance()
    {
        System.out.println("There are total "+balance+ " in your account");
    }
    public static void main(String [] args)
    {
        BankAccount ba=new BankAccount("Aryan chaurasia",20000);
        if (ba instanceof BankAccount)
        {
            System.out.println("Yes the ba is instance of Bank account");
        }
        else {
            System.out.println("No ba is not the instance of Bank account");
        }
        ba.withdraw(500);
        ba.deposit(2000);
        ba.getData();
        ba.getTotalAccount();


    }
}