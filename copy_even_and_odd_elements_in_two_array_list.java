import java.util.ArrayList;
import java.util.Scanner;
class copy_even_and_odd_elements_in_two_array_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,arr[];
        arr=new int[100];
        ArrayList<Integer>even;
        even=new ArrayList<Integer>();
        ArrayList<Integer>odd;
        odd=new ArrayList<Integer>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("copy even elements into array list");
        for(i=0;i<n;i++)
        {
        if(arr[i]%2==0)
        {
            even.add(arr[i]);
        }
       else
       {
        odd.add(arr[i]);
       }
    }
        System.out.println("display array lists ");
        System.out.println(even);
        System.out.println(odd);
    }
}