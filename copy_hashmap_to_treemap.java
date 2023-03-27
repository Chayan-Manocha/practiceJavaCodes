import java.util.*;
class copy_hashmap_to_treemap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        String k1,k2;
        int v1,v2;
        System.out.println("Enter the number of enteries to be neterd in the hashmap");
        n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> m1;
        m1=new HashMap<String,Integer>();
        HashMap<String,Integer> m2;
        m2=new HashMap<String,Integer>();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name of the product to be eneterd in the hashmap");
            k1=sc.nextLine();
            System.out.println("enter the price of the product to be eneterd in the hashmap");
            v1=sc.nextInt();
            sc.nextLine();
            m1.put(k1,v1);
        }
        for(Map.Entry j:m1.entrySet())
        {
            k2=String.valueOf(j.getKey());
            v2=(Integer)j.getValue();
            m2.put(k2,v2);
        }
        for(Map.Entry j:m2.entrySet())
        {
            System.out.println("key" +j.getKey());
            System.out.println("value" +j.getValue());

        }
    }
}