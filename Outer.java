import java.util.Scanner;
public class Ncheck {
    int num;
    Ncheck(int n)
    {
        num=n;
    }

    void check()
    {
        if(num>0)
            {
            System.out.println(num+ " is a positive number");
            }
        else if (num<0)
            {
                System.out.println(num+"is a negative number");
            } 
        else
            {
                System.out.println("It is zero");
            }      
}

public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number for checking: ");
    int no= sc.nextInt();
    Ncheck obj= new Ncheck(no);
    obj.check();
    sc.close();
}
}
