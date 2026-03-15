package lab2.Problem3;

public class SavingsAccount extends Account {
    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    private double interestRate;

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + " [Interest Rate: " + interestRate + "%]";
    }
    
    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }
}