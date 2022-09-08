import java.util.Scanner;
class count_digits_while
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,r=0,c;
        c=0;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        i=n;
        while(i>0)
        {
            r=i%10;
            i=i/10;
            c+=1;
        }
        System.out.println(c);
    }
}