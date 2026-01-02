// Demonstrates Encapsulation
class Account {
    private double balance;

    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(500);
        System.out.println("Balance: " + a.getBalance());
    }
}
