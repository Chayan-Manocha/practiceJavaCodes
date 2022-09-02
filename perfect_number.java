import java.util.Scanner;
class perfect_number
{
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int i,n,sum;
        System.out.println("enter thw value of n");
        n=sc.nextInt();
        sum=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
                if(sum==n)
                {
                    System.out.println("entered number is a perfect number");
                }
                else
                {
                    System.out.println("entered number is not a perfect number");
                }
    }
}