public class Rectangle {
    double l,b;
    void cal()
    {
        double area= l*b;
        double perimeter= 2*(l+b);
        System.out.println("Area of Rectangle is= "+area);
         System.out.println("Perimeter of Rectangle is= "+perimeter);
    }

    public static void main(String[] args) {
        Rectangle obj= new Rectangle();
        obj.l=22;
        obj.b=4;
        obj.cal();
    }
}
