import java.util.Scanner;
class count_of_factor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,count;
        count=0;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}