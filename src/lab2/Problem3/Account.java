package lab2.Problem3;

public class Account {
    public Account(int accNumber) {
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    public void deposit(double sum) {
        if (sum > 0) 
        		balance += sum;
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) 
        		balance -= sum;
    }


    public double getBalance() { return balance; }
    public int getAccountNumber() { return accNumber; }

    public void transfer(double amount, Account other) {
        if (amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    public final void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Account #" + accNumber + " [Balance: " + balance + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return accNumber == account.accNumber;
    }

    @Override
    public int hashCode() {
        return accNumber;
    }
    
    private double balance;
    private int accNumber;
}