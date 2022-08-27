import java.util.Scanner;
public class devide
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
                double a,b,result;
        System.out.println("enter the value of dividend");
        a=sc.nextDouble();
        System.out.println("enter the value of divisor");
        b=sc.nextDouble();
        result=a/b;
        System.out.println("the quotient of the above division is " +result);
    }
}
