import java.util.*;

import javax.management.ValueExp;
class combination_two_hashmap
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int i,n;
    int v1,v2;
    String k1,k2;
    System.out.println("enter the number of entries to be entered in the hashmap");
    n=sc.nextInt();
    sc.nextLine();
    HashMap<String,Integer> m1;
    m1=new HashMap<String,Integer>();
    HashMap<String,Integer> m2;
    m2=new HashMap<String,Integer>();
    for(i=0;i<n;i++)
    {
        System.out.println("enter the name of the entries to be enterd in the hashmap");
        k1=sc.nextLine();
        System.out.println("enter the salary of the entries to be enterd in the hashmap");
        v1=sc.nextInt();
        sc.nextLine();
        m1.put(k1,v1);
    }
    for(i=0;i<n;i++)
    {
        System.out.println("enter the name of the entries to be enterd in the hashmap");
        k2=sc.nextLine();
        System.out.println("enter the salary of the entries to be enterd in the hashmap");
        v2=sc.nextInt();
        sc.nextLine();
        m2.put(k2,v2);
    }
    int salary;
    for(Map.Entry j:m1.entrySet())
    {
    salary=(Integer)j.getValue();
    {
        System.out.println("name"+j.getKey());
        System.out.println("age"+j.getValue());
        System.out.println("salary"+salary);
    }
}
}
}