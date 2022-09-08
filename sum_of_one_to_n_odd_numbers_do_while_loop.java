import java.util.Scanner;
class sum_of_one_to_n_odd_numbers_do_while_loop
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        i=1;
        do
        {
            sum+=i;
            i+=2;
        }
        while(i<=n);
        System.out.println(sum);
    }
}