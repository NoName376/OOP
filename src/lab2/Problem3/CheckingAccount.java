package lab2.Problem3;

public class CheckingAccount extends Account {
    public CheckingAccount(int accNumber, double overdraftLimit) {
        super(accNumber);
        this.overdraftLimit = overdraftLimit;
    }

    private double overdraftLimit;
    private static final double TRANSACTION_FEE = 0.50;

    @Override
    public void withdraw(double sum) {
        if (sum > 0 && (getBalance() + overdraftLimit) >= (sum + TRANSACTION_FEE)) {
            super.withdraw(sum + TRANSACTION_FEE);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Overdraft Limit: " + overdraftLimit + "]";
    }
}