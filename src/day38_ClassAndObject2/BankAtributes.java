package day38_ClassAndObject2;

public class BankAtributes {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Amount can not be negative");
            return;
        }
        System.out.println("Depositing "+ amount+ "To account  number " + accountNumber);
         balance += amount;
    }
    public void withdraw(double amount){
        System.out.println("Withdrowing $"+amount+" from the account number "+accountNumber);
        balance -=amount;
    }
    public void chceckaBalance(){
        System.out.println("BAlance is: " + balance);
    }
}
