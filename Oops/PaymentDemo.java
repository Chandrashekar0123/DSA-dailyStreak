// File: PaymentDemo.java
interface Payment {
    // Abstract methods
    void pay(double amount);
    void refund(double amount);
}

// Class implementing the interface
class PayPal implements Payment {
    private String accountEmail;

    // Constructor
    public PayPal(String email) {
        this.accountEmail = email;
    }

    // Implement interface methods
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account: " + accountEmail);
    }

    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to PayPal account: " + accountEmail);
    }

    public static void main(String[] args) {
        PayPal myPay = new PayPal("alice@example.com");
        myPay.pay(100.50);
        myPay.refund(50.25);
    }
}


/*
OUTPUT :
Paid $100.5 using PayPal account: alice@example.com
Refunded $50.25 to PayPal account: alice@example.com
*/