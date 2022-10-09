import java.util.ArrayList;
import java.util.Scanner;
class display_string_with_vowel
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
        System.out.println("display the string starting with a vowel");
        for(String j:al)
        {
            a=j.charAt(0);
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
            {
                System.out.println(j);
            }
        }
    }
}