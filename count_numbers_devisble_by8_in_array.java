import java.util.Scanner;
class count_numbers_devisble_by8_in_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,arr[],count=0;
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
            if(arr[i]%8==0)
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}