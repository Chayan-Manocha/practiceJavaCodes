import java.util.*;
class input_name_salary_in_hashmap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        int k,v;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        HashMap<String,Integer> m;
        m=new HashMap<String,Integer>();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name");
            k=sc.nextLine();
            System.out.println("enter the salary");
            v=sc.nextInt();
            m.put(k,v);
        }
        System.out.println("the hash map is");
        for(Map.Entry j:m.entrySet())
        {
            System.out.println("key"+j.getKey());
            System.out.println("Value"+j.getValue());
        }
    }
}