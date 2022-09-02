import java.util.Scanner;
class table_of_number_using_while
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the value of n ");
        n=sc.nextInt();
        i=n;
        while(i<=(10*n))
        {
            System.out.println(i);
            i+=n;
        }
         
    }
}