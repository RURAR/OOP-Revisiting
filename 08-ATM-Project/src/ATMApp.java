// ATM Mini Project
import java.util.Scanner;

public class ATMApp {
    private double balance = 1000;

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if(amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance");
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        ATMApp atm = new ATMApp();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int ch = sc.nextInt();
            if(ch == 4) break;

            switch(ch) {
                case 1: atm.deposit(sc.nextDouble()); break;
                case 2: atm.withdraw(sc.nextDouble()); break;
                case 3: atm.checkBalance(); break;
            }
        }
        sc.close();
    }
}
