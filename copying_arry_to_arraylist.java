import java.util.ArrayList;
import java.util.Scanner;
class copying_arry_to_arraylist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,arr[];
        ArrayList<Integer> AL;
        AL=new ArrayList<Integer>();
        arr=new int[100];
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("to copy the array in array list");
        for(i=0;i<n;i++)
        {
            AL.add(arr[i]);
        }
        System.out.println("display the array");
        for(i=0;i<n;i++)
        {
            System.out.println(AL);
        }
    }
}