import java.util.Scanner;
class count_of_one_to_n_numbers_devisible_by_5_do_while_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,count=0;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        i=5;
        do
        {
            count+=1;
            i+=5;
        }
        while(i<=n);
        System.out.println(count);
    }
}