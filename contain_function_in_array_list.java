import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class contain_function_in_array_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        String x,k;
        ArrayList<String> al;
        al=new ArrayList<String>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the value of k");
        k=sc.nextLine();
        System.out.println("enter the array list");
        for(i=0;i<n;i++)
        {
            x=sc.nextLine();
            al.add(x);
        }
        System.out.println("display the containing element");
            if (al.contains(k))
            {
                System.out.println("string found");
            }
            else 
            {
                System.out.println("string not found");

            }
    }
}