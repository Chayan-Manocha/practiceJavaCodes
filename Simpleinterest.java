import java.util.Scanner;
    public class SimpleIntrest
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(system.in);
            double p,r,t,SI;
            System.out.printn("enter the value of principle amount ");
            p=sc.nextInt();
            System.out.println("enter the value of rate of intrest ");
            r=sc.nextInt();
            System.out.println("enter the of time ");
            t=sc.next();
            SI=(p*r*t)/100;
            System.out.println("Simple Interest is "+SI);
        }
    }

}
