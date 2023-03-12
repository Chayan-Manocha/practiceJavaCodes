import java.util.*;
class hash_map_entry
{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int v,k;
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        HashMap<Integer,Integer> m;
        m=new HashMap<Integer,Integer>();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the roll number");
            k=sc.nextInt();
            System.out.println("enter the age");
            v=sc.nextInt();
            m.put(k,v);
        }
        System.out.println("display the Hash Map");
        for(Map.Entry j:m.entrySet())
        {
            System.out.println("key"+j.getKey());
            System.out.println("value"+j.getValue());
        }
    }
}