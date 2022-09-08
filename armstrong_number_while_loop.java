import java.util.Scanner;
class armstrong_number_while_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,r,n,sum=0;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        i=n;
        while(i>0)
        {
            r=i%10;
            i=i/10;
            sum+=(r*r*r);
        }
        if(sum==n)
        {
            System.out.println("entered number is armstrong");
        }
        else 
        {
            System.out.println("entered number is not armstrong");
        }
    }
}