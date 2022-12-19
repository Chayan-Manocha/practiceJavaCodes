import java.util.ArrayList;
import java.util.Scanner;
class array_out_of_bound_exception_using_array_and_array_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
        int i,n,arr[];
        arr=new int[8];
        ArrayList<Integer> al;
        al=new ArrayList<Integer>();
        System.out.println("enter the number of elements to be entered in the array");
        n=sc.nextInt();
        System.out.println("enter the elements of the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        al.add(arr[i]);
        System.out.print(al);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}