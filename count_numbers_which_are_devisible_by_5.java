import java.util.Scanner;
public class count_numbers_which_are_devisible_by_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
                int i,n,count;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        count=0;
        for(i=1;i<=n;i+=5)
        {
            count+=1;
        }
        System.out.println(count);
    }

}
