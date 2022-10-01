import java.util.ArrayList;
import java.util.Scanner;
class display_even_elements_of_array_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,x;
        ArrayList<Integer> al;
        al=new ArrayList<Integer>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the the array list");
        for(i=0;i<n;i++)
    {
        x=sc.nextInt();
        al.add(x);
    }
    System.out.println("display the array");
        for(int j:al)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
        }

    }
}