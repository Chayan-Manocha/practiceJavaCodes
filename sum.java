import java.util.Scanner;
class SimpleIntrest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t,SI;
        System.out.println("enter the value of principle amount ");
        p=sc.nextDouble();
        System.out.println("enter the value of rate of intrest ");
        r=sc.nextDouble();
        System.out.println("enter the of time ");
        t=sc.nextDouble();
        SI=(p*r*t)/100;
        System.out.println("Simple Interest is "+SI);
    }
}

