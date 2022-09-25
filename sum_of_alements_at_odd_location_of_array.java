import java.util.Scanner;
class sum_of_alements_at_odd_location_of_array
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int i,n,arr[],sum=0;
    arr=new int[100];
    System.out.println("enter the value of n");
    n=sc.nextInt();
    System.out.println("enter the array");
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("display the array");
    for(i=0;i<n;i++)
    {
        if(i%2 != 0)
        {
            sum+=arr[i];
        }
    }
    System.out.println(sum);
    }
}