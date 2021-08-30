package day43_OOP_Encapsulation;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder(){
        return accountHolder;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder =accountHolder;

    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber =accountNumber;
    }
    public void setBalance(double balance){
        this.balance =balance;
    }

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(){
        System.out.println(accountHolder+" is depositing money to the account "+ accountNumber);
    }
    public void withdraw(){
        System.out.println(accountHolder+" is withdrawing money from the account number "+accountNumber);
    }
    public void checkBalance(){
        System.out.println("Balance is " +balance);
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
/*
 create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields
        add a constructor that can set all the instances
        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments

 */