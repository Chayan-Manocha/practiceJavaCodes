import java.util.ArrayList;
import java.util.Scanner;
class temperature
{
    int i,n,x,city_id;
    double sum=0,avg=0;
    String city_name;
    ArrayList<Integer> al=new ArrayList<Integer>();
    void enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the city whose temperature is being recorded");
        city_name=sc.nextLine();
        System.out.println("Enter the number of days for which the temperature is being recorded");
        n=sc.nextInt();
        System.out.println("Enter the id of the city whose temperature is to be searched");
        city_id=sc.nextInt();
        System.out.println("Enter the temperature of the city recarded int past n days");
        for(i=0;i<n;i++)
        {
            x=sc.nextInt();
            al.add(x);
        }
    }
    void calc() throws ArrayIndexOutOfBoundsException
    {
    for(int j:al)
    {
        if(-1<=j && j>=50)
        {
            throw new ArrayIndexOutOfBoundsException("entered temperature cannot exist");
        } 
        else
        {
            sum+=j;
            avg=sum/n;
        }
    }
    }
    private String extracted() {
        return "temperature enterd cannot exist";
    }
    void display()
    {
        System.out.println("The name of the city whose temperature is to be recorded" +city_name);
        System.out.println("The id of the city whose temperature is to be recorded" +city_id);
        System.out.println("The avg temperature for the entered city is " +avg);
        System.out.println("The name of the city whose temperature is to be recorded" +city_name);
    }
}
class throws_temperature_of_city
{
    public static void main(String args[])
    {
        try
        {
        temperature obj=new temperature();
        obj.enter();
        obj.calc();
        obj.display();
    } 
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}