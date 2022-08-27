import java.util.Scanner;
public class eldest_and_youngest_of_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the age of 1st person");
        a=sc.nextInt();
        System.out.println("enter the age of 2nd person");
        b=sc.nextInt();
        System.out.println("enter the age of 3rd person");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            if(b>c)
            {
                System.out.println("a is the eldest & c is the youngest ");
            }
            else
            {
                System.out.println("a is the eldest & b is the youngest ");
            }
        }
        else if (b>c && b>a)
        {
            if (a>c)
            {
                System.out.println("b is the eldest & c is the youngest ");
            }
            else
            {
                System.out.println("b is the eldest & a is the youngest ");
            }
        }
        else
        {
            if(a>b)
            {
                System.out.println("c is the eldest & b is the youngest ");
            }
            else
            {
                System.out.println("c is the eldest & a is the youngest ");
            }
        }
    }

}
