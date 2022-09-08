import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;
class factors_of_a_given_number_do_while_loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        i=1;
        do
        {
           if(n%i==0)
           {
            System.out.println(i);
           }
           i++;
        }
        while(i<=n);
        
    }
    }