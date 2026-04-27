abstract class Asset{
    abstract void display();
}
class Stock extends Asset{
    void display(){System.out.println("Stock");}
}
class Bond extends Asset{
    void display(){System.out.println("Bond");}
}
class Savings extends Asset{
    void display(){System.out.println("Savings");}
}
class Main{
    public static void main(String[] a){
        Asset x=new Stock(); x.display();
        x=new Bond(); x.display();
        x=new Savings(); x.display();
    }
}
