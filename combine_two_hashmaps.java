import java.security.Key;
import java.util.*;
class combine_two_hashmaps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int v1,v2;
        String k1,k2;
        System.out.println("enter the valus of n");
        n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> m1;
        m1=new HashMap<String,Integer>();
        HashMap <String,Integer> m2;
        m2=new HashMap<String,Integer>();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the name to be entered in the hashmap");
            k1=sc.nextLine();
            System.out.println("Enter the age of the person to be entered in the hashmap");
            v1=sc.nextInt();
            sc.nextLine();
            m1.put(k1,v1);
        }
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name to be entered int the hashmap");
            k2=sc.nextLine();
            System.out.println("enter the salary of the person to be entered in the hashmap");
            v2=sc.nextInt();
            sc.nextLine();
            m2.put(k2, v2);
        }
        int vl;
        String p;
        for(Map.Entry j:m1.entrySet())
        {
            System.out.println("Key"+j.getKey());
            System.out.println("Value"+j.getValue());
            p=String.valueOf(j.getKey());
            vl=m2.get(p);
            System.out.println(vl);
        }
    }
}