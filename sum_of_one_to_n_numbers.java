import java.util.Scanner;
public class sum_of_one_to_n_numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,sum;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        sum=0;
        for (i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }

}
