interface Bank {
    void deposit(double amt);
}

class Customer {
    String name;
}

class Account extends Customer implements Bank {
    double bal;

    public void deposit(double amt) {
        bal += amt;
        System.out.println("Balance: " + bal);
    }
}

class Main {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(1000);
    }
}
