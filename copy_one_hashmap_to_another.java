import java.util.*;
class copy_one_hashmap_to_another
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int v1,v2;
        String k1,k2;
        System.out.println("enter the value of the n");
        n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> m1;
        m1=new HashMap<String,Integer>();
        HashMap<String,Integer> m2;
        m2=new HashMap<String,Integer>();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name of the entry");
            k1=sc.nextLine();
            System.out.println("enter the age of the entry");
            v1=sc.nextInt();
            sc.nextLine();
            m1.put(k1,v1);
        }
        for(i=0;i<n;i++)
        {
            
        }
        for(Map.Entry j:m2.entrySet())
        {
            System.out.println("key"+ j.getKey());
            System.out.println("value"+ j.getValue());
        }
    }
}