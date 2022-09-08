import java.util.Scanner;
class table_of_a_given_number_do_while_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        i=n;
        do
        {
            System.out.println(i);
            i+=n;
        }
        while(i<=(n*10));
    }
}