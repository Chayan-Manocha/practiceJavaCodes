import java.util.Scanner;
class to_diplay_array_in_reverse_order
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
        System.out.println("diplay the reverse ordered array");
        for(i=(n-1);i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}