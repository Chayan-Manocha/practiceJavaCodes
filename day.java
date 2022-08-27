import java.util.Scanner;
public class day
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int day_no;
        System.out.println("enter the value of the day you want to display");
                day_no= sc.nextInt();
        switch(day_no)
        {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
                case 7:
                    System.out.println("The day is Sunday");
                    break;
            default:
                System.out.println("The entered number does not exist");
        }

    }

}
