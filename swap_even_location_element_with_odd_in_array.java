import java.util.Scanner;
class swap_even_location_element_with_odd_in_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c,arr[];
        arr=new int[100];
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Swap the array");
        for(i=0;i<n-1;i++)
        {
            if(i%2==0)
            {
            c=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=c;
            }
        }
        System.out.println("Display the array");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}