import java.util.Scanner;
public class count_within_the_given_range_devisible_by_8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,x,y,count;
        System.out.println("enter the value of x");
        x=sc.nextInt();
        System.out.println("enter the value of y");
        y=sc.nextInt();
        count=0;
        for(i=x;i<=y;i+=8)
        {
            count+=1;
        }
        System.out.println(count);
    }

}
