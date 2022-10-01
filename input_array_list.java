import java.util.ArrayList;
import java.util.Scanner;
class input_array_list
{
public static void main(String args[]) 
{
    Scanner sc=new Scanner(System.in);
        int i,n,x;
        ArrayList<Integer> al;
        al=new ArrayList<Integer>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the array list");
        for(i=0;i<n;i++)
        {
            x=sc.nextInt();
            al.add(x);
        }
        System.out.println("display the array list");
        for(int j:al)
        {
            System.out.println(j);
        }
    }
    
}