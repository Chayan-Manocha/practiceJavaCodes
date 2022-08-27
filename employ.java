import java.util.Scanner;
public class employ
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no_of_hours;
        double wage_per_hour,total_income;
        System.out.println("enter the value of wage per hour ");
        wage_per_hour=sc.nextDouble();
        System.out.println("enter the number of hours worked ");
        no_of_hours=sc.nextInt();
        if(no_of_hours<=8)
        {
            total_income=(no_of_hours*wage_per_hour)+0;
        }
        else if (no_of_hours>=9 && no_of_hours<=10)
        {
            total_income=(no_of_hours*wage_per_hour)+100;
        }
        else if (no_of_hours>=11 && no_of_hours<=12)
        {
            total_income=(no_of_hours*wage_per_hour)+300;
        }
        else
        {
            total_income=(no_of_hours*wage_per_hour)+600;
        }
        System.out.println("the total income earned by the employ in rupees is " +total_income);
    }
}
