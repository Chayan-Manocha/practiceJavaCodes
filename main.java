import java.util.Scanner;
class greatest_of_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter the value of first number ");
        a=sc.nextInt();
        System.out.println("enter the value of second number ");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater than b ");
        }
        else {
            System.out.println("b is greater than a ");
        }
    }

}
