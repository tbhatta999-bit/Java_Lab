public class Outer{
    int x=100;

class Inner {
    void display()
    {
        System.out.println("Value of x is: "+x);

    }
    
}
public static void main(String[]args)
    {
        Outer obj= new Outer();
        Outer.Inner innerObj= obj.new Inner();
        innerObj.display();
    }
}
