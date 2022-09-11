import java.util.Scanner;
class devisble_by_5_in_array
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
        System.out.println("display the array");
        for(i=0;i<n;i++)
        {
            if(arr[i]%5==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}