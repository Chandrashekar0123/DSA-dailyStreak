// Oops/Encapsulation.java
// Example of Encapsulation in Java

class BankAccount {
    // Private fields (data hiding)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Public setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating object of BankAccount
        BankAccount acc = new BankAccount("Chandra Shekar", 5000);

        // Using getters
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Initial Balance: ₹" + acc.getBalance());

        // Using methods to modify balance
        acc.deposit(1500);
        acc.withdraw(2000);

        // Updating account holder using setter
        acc.setAccountHolder("Shekar Reddy");
        System.out.println("Updated Account Holder: " + acc.getAccountHolder());
        System.out.println("Final Balance: ₹" + acc.getBalance());
    }
}
