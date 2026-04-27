class MotorVehicle{
    String name;int num;double price;
    MotorVehicle(String n,int no,double p){name=n;num=no;price=p;}
}
class Car extends MotorVehicle{
    double d;
    Car(String n,int no,double p,double d){super(n,no,p);this.d=d;}
    void display(){
        System.out.println(name+" "+num+" "+price+" "+d);
    }
    void discount(){
        System.out.println("Final:"+ (price-price*d));
    }
}
class Main{
    public static void main(String[] a){
        Car c=new Car("BMW",101,50000,0.1);
        c.display();
        c.discount();
    }
}
