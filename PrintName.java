public class OddEven {
    int n;
    void check()
    {
        if(n%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
    public static void main(String[] args){
        OddEven obj= new OddEven();
        obj.n=7;
        obj.check();
    }
}
