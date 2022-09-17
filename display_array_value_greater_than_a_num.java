import java.util.Scanner;
class display_array_value_greater_than_a_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,k,arr[];
        arr=new int[100];
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the value of k");
        k=sc.nextInt();
        System.out.println("enter the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("display the array");
        for(i=0;i<n;i++)
        {
            if(arr[i]>=k)
            {
            System.out.println(arr[i]);
            }
        }
    }
}