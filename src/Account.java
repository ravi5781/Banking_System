public class Account {
    public Account(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    int accountNumber;
    double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(balance>0){
            balance=balance+amount;
        }
    }

    void withdraw(double amount){
        if (amount <= balance) {
            balance =balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double calculateInterest(){
        return 0.0;
    }
}
