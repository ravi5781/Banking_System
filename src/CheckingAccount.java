public class CheckingAccount extends Account{
    public CheckingAccount(int accountNumber, double balance, double monthlyFee) {
        super(accountNumber, balance);
        this.monthlyFee = monthlyFee;
    }

    double monthlyFee;
    public double calculateInterest() {
        return 0.0;
    }
}
