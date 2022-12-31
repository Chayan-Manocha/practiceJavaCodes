import java.util.Scanner;
class array_index_out_of_bound
{
    public static void func(int arr[],int n)
    {
        int i;
        int sum=0,avg=0;
        for(i=0;i<n;i++)
        {
        if(arr[i]<=0)
        {
            throw new ArrayIndexOutOfBoundsException("negative elements not allowed");
        }
        else
        {
            sum+=arr[i];
        }
    }
            avg=sum/n;
            System.out.println(avg);
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,arr[];
        arr=new int[100];
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        try
        {
            func(arr,n);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}