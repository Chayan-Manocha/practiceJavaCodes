import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class display_count_of_diff_type_of_strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int count_one=0,count_two=0,count_three=0,count_four=0;
        char a;
        String x;
        ArrayList<String> al;
        al=new ArrayList<String>();
        System.out.println("Ente the value of n");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the array list");
        for(i=0;i<n;i++)
        {
            x=sc.nextLine();
            al.add(x);
        }
        System.out.println("display the count of diff strings in the array list");
        for(String j:al)
        {
            a=j.charAt(0);
            if(Character.isUpperCase(a))
            {
                count_one+=1;
            }
            else if(Character.isLowerCase(a))
            {
                count_two+=1;
            }
            else if(Character.isDigit(a))
            {
                count_three+=1;
            }
            else
            {
                count_four+=1;
            }
        }
        System.out.println(count_one);
        System.out.println(count_two);
        System.out.println(count_three);
        System.out.println(count_four);
    }
}