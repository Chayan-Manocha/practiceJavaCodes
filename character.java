import java.util.Scanner;
public class character
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.println("enter the alphabet to be examined ");
        a=sc.next().charAt(0);
        if(Character.isUpperCase(a))
        {
            System.out.println("enter alphabet is in upper case ");
        }
        else if(Character.isLowerCase(a))
        {
            System.out.println("entered alphabet is in lower case");
        }
        else if(Character.isDigit(a))
        {
            System.out.println("entered alphabet is a digit ");
        }
        else
        {
           System.out.println("entered alphabet is spl character");
        }
    }
}
