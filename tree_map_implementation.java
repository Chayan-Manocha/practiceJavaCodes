import java.util.*;
class tree_map_implementation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        String v;
        int k;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        sc.nextLine();
        TreeMap<Integer,String> t1;
        t1=new TreeMap<Integer,String>();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the number");
            k=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the name of the enteries");
            v=sc.nextLine();
            t1.put(k,v);
        }
            for(Map.Entry j:t1.entrySet())
            {
                System.out.println("key"+ j.getKey());
                System.out.println("value"+ j.getValue());
            }
    }
}