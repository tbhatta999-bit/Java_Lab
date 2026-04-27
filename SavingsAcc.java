abstract class Accounts{
    double bal;
    Accounts(double b){bal=b;}
    abstract void deposit(double a);
    abstract void withdraw(double a);
    void display(){System.out.println("Balance:"+bal);}
}
class SavingsAccount extends Accounts{
    double r=0.1;
    SavingsAccount(double b){super(b);}
    void deposit(double a){bal+=a;}
    void withdraw(double a){bal-=a;}
    void calc(){System.out.println("Interest:"+(bal*r));}
}
class Main{
    public static void main(String[] a){
        SavingsAccount s=new SavingsAccount(1000);
        s.deposit(500);
        s.withdraw(200);
        s.display();
        s.calc();
    }
}
