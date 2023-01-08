import java.util.Scanner;
import java.util.ArrayList;
class avg_of_element_having_value_less_than_a_given_number
{
    public static void function(int arr[],int n)
    {
        int i;
        int sum=0;
        double avg=0;
        ArrayList<Integer> al;
        al=new ArrayList<Integer>();
        System.out.println("copying the elements of array in array list");
        for(i=0;i<n;i++)
        {
            if(arr[i]>2000)
            {
                throw new ArithmeticException("Value more than threshold value");
            }
            else
            {
                al.add(arr[i]);
            }
            sum+=al.get(i);
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
        System.out.println("enter the value of array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        try
        {
            function(arr,n);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}