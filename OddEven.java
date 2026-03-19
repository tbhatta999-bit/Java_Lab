import java.util.Scanner;
public class Max 
{   int m;
    int a;
    int b;
    int c;

    Max(int n1, int n2, int n3)
    {
        a=n1;
        b=n2;
        c=n3;
    }
    void check()
    {
        if(a>=b && a>=c)
        {
            m=a;
        }
        else if(b>=a && b>=c)
        {
            m=b;
        }
        else
        {
            m=c;
        }

        System.out.println("The maximum number out the three is "+m);


    }

    public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number : ");
    int num1= sc.nextInt();
    System.out.println("Enter second number : ");
    int num2= sc.nextInt();
    System.out.println("Enter third number : ");
    int num3= sc.nextInt();
    Max obj= new Max(num1,num2,num3);
    obj.check();
    sc.close();
}
}
