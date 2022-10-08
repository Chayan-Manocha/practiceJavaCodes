import java.util.ArrayList;
import java.util.Scanner;
class display_string_with_three_character
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int i,n,count=0;
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
    System.out.println("displaying the strings with 3 characters");
    for(String j:al)
    {
        count=j.length();
        if(count==3)
        {
            System.out.println(j);
        }
    }
   }
}