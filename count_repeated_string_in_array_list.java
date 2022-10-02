import java.util.ArrayList;
import java.util.Scanner;
class count_repeated_string_in_array_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,count=0;
        String x,k;
        ArrayList<String> al;
        al=new ArrayList<String>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the value of k");
        k=sc.nextLine();
        System.out.println("enter the elements in array list \n");
        for(i=0;i<n;i++)
        {
            x=sc.nextLine();
            al.add(x);
        }
        System.out.println("display the count of repeated string in the array list \n");
        for(String j:al)
        {
        if(j.equals(k))
        {
            count+=1;
        }
    }
        System.out.println(count);
    }
}
