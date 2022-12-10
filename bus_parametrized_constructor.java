import java.util.Scanner;
class bus
{
    private int ticket_id,no_of_person;
    private String pick_up,destination;
    private double total_fair,fair_per_person;
    bus(int n_person, double f_person)
    {
        no_of_person=n_person;
        fair_per_person=f_person;
    }
    void enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ticket id");
        ticket_id=sc.nextInt();
        System.out.println("enter the pickup location");
        pick_up=sc.next();
        System.out.println("enter the place of destination");
        destination=sc.next();
    }
    void calc()
    {
        total_fair=no_of_person*fair_per_person;
    }
    void display()
    {
        System.out.println(ticket_id);
        System.out.println(pick_up);
        System.out.println(destination);
        System.out.println(no_of_person);
        System.out.println(fair_per_person);
        System.out.println(total_fair);
    }
}
    class bus_parametrize_constructor
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n_person;
            double f_person;
            System.out.println("enter the number of people in the bus");
            n_person=sc.nextInt();
            System.out.println("enter the fair per person");
            f_person=sc.nextDouble();
            bus obj=new bus(n_person,f_person);
            obj.enter();
            obj.calc();
            obj.display();
        }
    }
