import java.util.Scanner;
class sum_of_digits_while_loop
{
    public static void main(String arg[])
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
            sum+=r;
        }
        System.out.println(sum);
    }
}