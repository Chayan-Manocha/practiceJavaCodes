import java.util.Scanner;
class factorial_userinput
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,product=1;
        System.out.println("enter the value of the number");
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            product*=i;
        }
        System.out.println(product);
    }
}