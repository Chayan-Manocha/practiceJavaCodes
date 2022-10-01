import java.util.ArrayList;
import java.util.Scanner;
class display_elements_devisible_by_five_in_array_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,x,n;
        ArrayList<Integer> al;
        al=new ArrayList<Integer>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the Array List");
        for(i=0;i<n;i++)
        {
            x=sc.nextInt();
            al.add(x);
        }
        System.out.println("display the Array List");
        for(int j:al)
        {
            if(j%5==0)
            {
                System.out.println(j);
            }
        }
    }
}