import java.util.Scanner;
public class else_if
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int a;
            System.out.println("enter the value to be checked ");
            a=sc.nextInt();
            if(a%2==0)
            {
                System.out.println("number is even");
            }
            else {
                System.out.println("number is odd");
            }
        }
}
