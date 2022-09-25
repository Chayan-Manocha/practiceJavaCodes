import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;
class copy_upper_and_lower_elements_in_two_array_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        char arr[];
        arr=new char[100];
        ArrayList<Character>upper;
        upper=new ArrayList<Character>();
        ArrayList<Character>lower;
        lower=new ArrayList<Character>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("elements to be copied");
        for(i=0;i<n;i++)
        {
            if(Character.isUpperCase(arr[i]))
            {
                upper.add(arr[i]);
            }
            else if(Character.isLowerCase(arr[i]))
            {
                lower.add(arr[i]);
            }
        }
        System.out.println("display the array list");
        System.out.println(upper);
        System.out.println(lower);
    }
}