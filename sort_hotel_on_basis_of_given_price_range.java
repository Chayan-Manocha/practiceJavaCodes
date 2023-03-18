import java.util.*;
class sort_hotel_on_basis_of_given_price_range
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        String k;
        double v;
        System.out.println("enter the number of entries for the hash map");
        n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Double> m;
        m=new HashMap<String,Double>();
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name of the hotel which is being entered in the hashmap");
            k=sc.nextLine();
            System.out.println("enter the price of the hotel room which is being entered in the hashmap");
            v=sc.nextDouble();
            sc.nextLine();
            m.put(k,v);
        }
        double vl,rl;
        double pl;
        System.out.println("enter the minimum price for sorting the hotels");
        vl=sc.nextDouble();
        System.out.println("enter the maximum price for sorting the hotels");
        rl=sc.nextDouble();
        for(Map.Entry j:m.entrySet())
        {
            pl=(Double)j.getValue();
            if(vl<=pl&&pl<=rl)
            {
                System.out.println(j.getKey());
            }
        }
    }
}