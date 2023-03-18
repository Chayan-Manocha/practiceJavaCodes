import java.util.*;
class sort_data_greater_or_equal_to_the_value
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        String k;
        int v;
        System.out.println("enter the value of n");
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
        int vl;
        int rl;
        System.out.println("enter the minimum salary required to display the hashmap details");
        vl=sc.nextInt();
        for(Map.Entry j:m.entrySet())
        {
            rl=(Integer)j.getValue();
            if(vl>=rl)
            {
                System.out.println(j.getKey());
            }
        }
    }
}