package lab2.Problem3;

import java.util.Vector;

public class Bank {
    public Bank() {
        accounts = new Vector<>();
    }
    
    public static void main(String[] args) {
        Bank myBank = new Bank();
        
        SavingsAccount sa = new SavingsAccount(101, 3.5);
        CheckingAccount ca = new CheckingAccount(102, 1000.0);
        
        sa.deposit(5000);
        ca.deposit(1000);
        
        myBank.openAccount(sa);
        myBank.openAccount(ca);
        
        myBank.update();
        
        sa.print();
        ca.print();
    }

    public void openAccount(Account a) {
        accounts.add(a);
    }

    public void closeAccount(Account a) {
        accounts.remove(a);
    }

    public void update() {
        for (Account a : accounts) {
            if (a instanceof SavingsAccount) {
                ((SavingsAccount) a).addInterest();
            } else if (a instanceof CheckingAccount) {
                System.out.println("Checking Account " + a.getAccountNumber() + " updated.");
            }
        }
    }

    private Vector<Account> accounts;
}