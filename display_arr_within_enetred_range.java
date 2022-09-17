import java.util.Scanner;
class display_arr_within_enetred_range
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,x,y,arr[];
        arr=new int[100];
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the value of x");
        x=sc.nextInt();
        System.out.println("enter the value of y");
        y=sc.nextInt();
        System.out.println("enter the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("display the array");
        for(i=0;i<n;i++)
        {
            if(arr[i]>=x && arr[i]<=y)
            {
                System.out.println(arr[i]);
            }
        }
    }
}