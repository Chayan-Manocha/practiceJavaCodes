import java.util.Scanner;
import java.util.ArrayList;
class display_string_starting_with_capital_letter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        char a;
        String x;
        ArrayList<String> al;
        al=new ArrayList<String>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the array list");
        for(i=0;i<n;i++)
        {
            x=sc.nextLine();
            al.add(x);
        } 
        System.out.println("display the string which starts with a capital letter");
        for(String j:al)
        {
            a=j.charAt(0);
            if(Character.isUpperCase(a))
            {
                System.out.println(j);
            }
        }
    }
}