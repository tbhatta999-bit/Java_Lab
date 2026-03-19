import java.util.Scanner;
public class Grade {
  double s1,s2,s3;
 Grade(double p1,double p2,double p3){
    s1=p1;
    s2=p2;
    s3=p3;
 }

    void cal(){
double avg= s1+s2+s3;
double p= (avg/300)*100;

if(p>=90)
{
    System.out.println("GRADE=A");
}
else if(p<90 && p>=80)
{
    System.out.println("GRADE=B");
}
else if(p<80 && p>=70)
{
    System.out.println("GRADE=C");
}
else if(p<70 && p>=60)
{
    System.out.println("GRADE=D");
}
else if(p<60 && p>40)
{
    System.out.println("GRADE=E");
}
else if(p<=40)
{
    System.out.println("GRADE=F");
}
    }
     public static void main(String[]args)
{
    
    double m1;
  double m2;
  double m3;
Scanner sc= new Scanner(System.in);
System.out.println("Enter marks for subject 1: ");
m1= sc.nextDouble();
System.out.println("Enter marks for subject 2: ");
m2= sc.nextDouble();
System.out.println("Enter marks for subject 3: ");
m3= sc.nextDouble();

    Grade obj= new Grade(m1,m2,m3);
    obj.cal();
    sc.close();
}
}
