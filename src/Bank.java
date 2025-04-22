public class Bank {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(1001, 5000.0, 0.05);
        System.out.println("Savings Account Interest: " + savings.calculateInterest());

        CheckingAccount checking = new CheckingAccount(1002, 3000.0, 50.0);
        System.out.println("Checking Account Interest: " + checking.calculateInterest());

        savings.deposit(1000.0);
        savings.withdraw(2000.0);
        System.out.println("Savings Balance: " + savings.getBalance());
    }
}
