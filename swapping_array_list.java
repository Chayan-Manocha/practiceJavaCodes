import java.util.ArrayList;
import java.util.Scanner;
class swapping_array_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,x,c,a,b;
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
        a=al.get(0);
        b=al.get(n-1);
        c=a;
        a=b;
        b=c;
        al.remove(0);
        al.add(0,a);
        al.remove(n-1);
        al.add(n-1,b);
        System.out.println("display the array list");
        for(int j:al)
        {
            System.out.println(j);
        }
    }
}