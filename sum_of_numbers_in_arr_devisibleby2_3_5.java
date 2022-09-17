import java.util.Scanner;
class sum_of_numbers_in_arr_devisibleby2_3_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,arr[],sum=0;
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
            if(arr[i]%2==0 && arr[i]%3==0 && arr[i]%5==0)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}