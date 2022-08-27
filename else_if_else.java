import java.util.Scanner;
public class else_if_else
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter value of first number ");
        a=sc.nextInt();
        System.out.println("enter value of second number ");
        b=sc.nextInt();
        System.out.println("enter value of third number ");
        c= sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("greatest number is a which is equal to " +a);
        }
        else if(b>a && b>c)
        {
            System.out.println("greatest number is b which is equal to " +b);
        }
        else
        {
            System.out.println("greatest number is c which is equal to 42" +c);
        }
    }
}
