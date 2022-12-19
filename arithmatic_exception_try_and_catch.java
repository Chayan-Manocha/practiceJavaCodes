import java.util.Scanner;
class arithmatic_exception_try_and_catch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        try
        {
            c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}