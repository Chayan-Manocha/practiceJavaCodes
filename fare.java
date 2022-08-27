import java.util.Scanner;
public class fare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no_of_adults,no_of_kids;
        double dist_traveled,fare,payable_amount;
        System.out.println("Enter the no. of adults ");
        no_of_adults=sc.nextInt();
        System.out.println("Enter the no. of kids ");
        no_of_kids=sc.nextInt();
        System.out.println("Enter the distance traveled ");
        dist_traveled=sc.nextDouble();
        if(dist_traveled>=10000)
        {
            fare=15000;
        }
        else if (dist_traveled>=8000 && dist_traveled<10000)
        {
            fare=12000;
        }
        else if(dist_traveled>=5000 && dist_traveled<8000)
        {
            fare=10000;
        }
        else if(dist_traveled>=3000 && dist_traveled<5000)
        {
            fare=8000;
        }
        else
        {
            fare=5000;
        }
        payable_amount=(no_of_adults*fare)+(no_of_kids*(fare/2));
        System.out.println("the total bill to be paid is " +payable_amount);
    }

}
