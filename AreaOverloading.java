class Area {

  
    void area(double r) {
        double result = 3.14 * r * r;
        System.out.println("Area of Circle = " + result);
    }

    
    void area(int l, int b) {
        int result = l * b;
        System.out.println("Area of Rectangle = " + result);
    }

   
    void area(int s) {
        int result = s * s;
        System.out.println("Area of Square = " + result);
    }
}

public class AreaOverloading {
    public static void main(String[] args) {
        Area a = new Area();

        a.area(5.0);     
        a.area(4, 6);     
        a.area(4);        
    }
}
