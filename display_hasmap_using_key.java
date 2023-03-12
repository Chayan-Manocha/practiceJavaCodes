import java.util.*;
class display_hasmap_using_key
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        String k;
        int v;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> m;
        m=new HashMap<String,Integer>();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name");
            k=sc.nextLine();
            System.out.println("enter the salary");
            v=sc.nextInt();
            sc.nextLine();
            m.put(k,v);
        }
        String key;
        System.out.println("enter the name of those people whose salary is to be displayed");
        key=sc.nextLine();
        int vl;
        vl=m.get(key);
        System.out.println(vl);
    }
}