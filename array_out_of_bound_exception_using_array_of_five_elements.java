import java.util.Scanner;
class array_out_of_bound_exception_using_array_of_five_elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[],n,i;
        arr=new int[5];
        System.out.println("enter the number of elements to be entered in the array");
        n=sc.nextInt();
        try
        {
            System.out.println("enter the elements in the array");
                for(i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}