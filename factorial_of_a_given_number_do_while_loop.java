import java.util.Scanner;
class factorial_of_a_given_number_do_while_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,factorial=1;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        i=1;
        do
        {
            factorial *=i;
            i++;
        }
        while(i<=n);
        System.out.println(factorial);

    }
}