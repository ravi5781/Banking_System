public class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }
    double interestRate;

    public double calculateInterest() {
        return balance*interestRate;
    }
}

