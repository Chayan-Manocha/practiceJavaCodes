import java.util.Scanner;
class one_to_n_even_number_while_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        i=2;
        while(i<=n)
        {
            System.out.println(i);
            i+=2;
        }
    }
}