import java.util.Scanner;
class replace_arr_divisible_by_5_with_1
{
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
        System.out.println("replace the array");
        for(i=0;i<n;i++)
        {
            if(arr[i]%5==0)
            {
            arr[i]=1;
            }
        }
        System.out.println("display the array");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}