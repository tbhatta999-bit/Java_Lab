public class Factorial {
    int num=5;
    int fact()
    {
        int f=1;
        for(int i=1; i<=num;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[]args)
    {
        Factorial obj=new Factorial();
        int result=obj.fact();
        System.out.println("Factorial of 5 is: "+result);
    }
}
