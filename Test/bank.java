package Test;

public class bank {
    private long accountNumber;
    private double balance;

    public void deposit(double amount){
        if(amount > 0)
       {
        balance += amount;
           System.out.println("Deposited");
        }
        else{
            System.out.println("Invalid! Try Again");
        }
    }

        public void withdraw(double amount){
            if(amount > 0 && amount <= balance ){
                balance -= amount;
                System.out.println("Withdrew");
            }
            else{
                System.out.println("Invalid");
            }
        }

    public double getBalance() {
        return balance;
    }

    public long setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
        return accountNumber;
    }



}
