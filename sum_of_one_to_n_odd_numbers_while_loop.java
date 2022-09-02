import java.util.Scanner;
class sum_of_one_to_n_odd_numbers_while_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,sum;
        System.out.println("enter the vale of n ");
        n=sc.nextInt();
        sum=0;
        i=1;
        while(i<=n)
        {
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
    }
}