import java.util.Scanner;
import java.util.scanner;
class factorial_using_while
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,factorial;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        i=1;
        factorial=1;
        while (i<=n)
        {
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
    }
}