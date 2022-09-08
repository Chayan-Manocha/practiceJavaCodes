import java.util.Scanner;
class represent_no_digit_by_digit_while_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,r,n;
        System.out.println("enter the value of n");
        n=sc.nextInt();

        i=n;
        while(i>0)
        {
            r=i%10;
            i=i/10;
            System.out.print(r);
        }
    }
}