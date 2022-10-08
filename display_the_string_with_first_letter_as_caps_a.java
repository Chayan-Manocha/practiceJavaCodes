import java.util.ArrayList;
import java.util.Scanner;
class display_the_string_with_first_letter_as_caps_a
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        String x;
        char a;
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
        System.out.println("display the character starting with A");
        for(String j:al)
        {
            a=j.charAt(0);
            if(a=='A')
            {
                System.out.println(j);
            }
        }
    }
}