import java.util.Scanner;
public class one_to_n
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
            System.out.println(i);
    }

}
