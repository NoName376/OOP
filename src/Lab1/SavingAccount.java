package Lab1;

public class SavingAccount {
    public static void main(String[] args) {
        double balance = 1000.0;
        double interestRate = 0.05;

        double interest = balance * interestRate;
        balance += interest;

        System.out.println("New balance: " + balance);
    }
}
