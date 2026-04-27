class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Funds");
    }

    void displayBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String acc, double bal, double rate) {
        super(acc, bal);
        interestRate = rate;
    }

    void addInterest() {
        balance += balance * interestRate / 100;
    }
}

class FixedDepositAccount extends SavingsAccount {
    int maturityPeriod;

    FixedDepositAccount(String acc, double bal, double rate, int period) {
        super(acc, bal, rate);
        maturityPeriod = period;
    }

    void calculateMaturityAmount() {
        double maturity = balance * Math.pow(1 + interestRate / 100, maturityPeriod);
        System.out.println("Maturity Amount = " + maturity);
    }
}

public class BankingDemo {
    public static void main(String[] args) {

        FixedDepositAccount obj =
                new FixedDepositAccount("ACC101", 50000, 5, 2);

        obj.deposit(5000);
        obj.addInterest();
        obj.calculateMaturityAmount();
        obj.displayBalance();
    }
}
