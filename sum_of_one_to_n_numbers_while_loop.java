import java.util.Scanner;
class sum_of_one_to_n_numbers_while_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,sum;
        System.out.print("enter the value of n");
        n=sc.nextInt();
        sum=0;
        i=0;
        while(i<=n)
        {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}