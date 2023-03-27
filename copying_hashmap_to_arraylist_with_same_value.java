import java.security.Key;
import java.util.*;
import java.util.Scanner;

import javax.xml.validation.Validator;
class copying_hasmap_to_arraylist_with_same_values
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String k;
        int i,n,v;
        HashMap<String,Integer> m;
        m=new HashMap<String,Integer>();
        ArrayList <Integer> al;
        al=new ArrayList<Integer>();
        System.out.println("enter the elements to be entered the hashmap");
        n=sc.nextInt();
        sc.nextLine();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name of the entries to be entered in the hashmap");
            k=sc.nextLine();
            System.out.println("Enter the age of the entries to be enterd in the hashmap");
            v=sc.nextInt();
            sc.nextLine();
            m.put(k,v);
        }
        int rl;
        String vl;
        String sl;
        System.out.println("enter the name to be entered");
        vl=sc.nextLine();
        for(Map.Entry j:m.entrySet())
        {
            sl=String.valueOf(j.getKey());
            rl=(Integer)j.getValue();
            if(vl.equals(sl))
            {
                al.add(rl);
            }
        }
        for(int z:al)
        {
            System.out.println(z);
        }
    }
}