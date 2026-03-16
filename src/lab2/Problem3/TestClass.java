package lab2.Problem3;

public class TestClass {
    public static void main(String[] args) {
        var myBank = new Bank();
        
        var sa = new SavingsAccount(101, 3.5); 
        var ca = new CheckingAccount(102, 1000.0);
        
        sa.deposit(5000);
        ca.deposit(1000);
        
        myBank.openAccount(sa);
        myBank.openAccount(ca);
        
        System.out.println("Before:");
        sa.print();
        ca.print();
        
        myBank.update();
        
        System.out.println("\nAfter:");
        sa.print();
        ca.print();

        System.out.println("\ntransfer (500$):");
        sa.transfer(500, ca);
        sa.print();
        ca.print();
    }
}