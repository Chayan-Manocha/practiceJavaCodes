import java.util.Scanner;
public class one_to_n_even_numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        for(i=2;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}
