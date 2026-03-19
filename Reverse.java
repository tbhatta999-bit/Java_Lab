public class PrintName {
    String name;
    void display()
    {
        System.out.println("Name: "+name);
    }
    public static void main(String[] args){
        PrintName obj = new PrintName();
        obj.name="ABC";
        obj.display();
    
    }
    
}
