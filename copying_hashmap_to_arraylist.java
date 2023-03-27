import java.security.Key;
import java.util.*;
import java.util.ArrayList;
class copying_hashmap_to_arraylist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String k;
        int i,n,v;
        HashMap<String,Integer> m;
        m=new HashMap<String,Integer>();
        ArrayList<String> al;
        al=new ArrayList<String>();
        System.out.println("enter the number of elements to be enterd in the hashmap");
        n=sc.nextInt();
        sc.nextLine();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name of the entry to be entered in the hash map");
            k=sc.nextLine();
            System.out.println("enter the age of the entry to be entered in the hash map");
            v=sc.nextInt();
            sc.nextLine();
            m.put(k,v);
        }
        int vl;
        System.out.println("enter the boundary value to search the elements");
        vl=sc.nextInt();
        String p;
        int rl;
        for(Map.Entry j:m.entrySet())
        {
            p=String.valueOf(j.getKey());
            rl=m.get(p);
            if(vl<=rl)
            {
                al.add(p);
                System.out.println(al);

            }
        }

    }
}