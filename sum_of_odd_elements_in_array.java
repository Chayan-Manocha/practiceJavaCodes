import java.util.Scanner;
class sum_of_odd_elements_in_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,arr[],sum;
        sum=0;
        arr=new int[100];
        System.out.println("eneter the value of n");
        n=sc.nextInt();
        System.out.println("eneter the value of array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("display the array");
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                sum+=arr[i];
            }

        }
        System.out.println(sum);

    }
}