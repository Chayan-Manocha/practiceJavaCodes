import java.util.Scanner;
class factor_sum
{
       public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,s;
        s=0;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        System.out.println(s);
    }
}