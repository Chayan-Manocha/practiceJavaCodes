import java.util.ArrayList;
import java.util.Scanner;
class copy_vowel_in_array_list
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        char arr[];
        arr=new char[100];
        ArrayList<Character>even;
        even=new ArrayList<Character>();
        ArrayList<Character>odd;
        odd=new ArrayList<Character>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        System.out.println("enter the array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("copy the array to the arraylist");
        for(i=0;i<n;i++)
        {
            if(i%2 == 0)
            {
                if(arr[i] == 'a')
                {
                even.add(arr[i]);
                }
                else if(arr[i] == 'e')
                {
                even.add(arr[i]);
                }
                else if(arr[i] == 'i')
                {
                even.add(arr[i]);
                }
                else if(arr[i] == 'o')
                {
                even.add(arr[i]);
                }
                else if(arr[i] == 'u')
                {
                even.add(arr[i]);
                }
            }
            if(i%2 != 0)
            {
                if(arr[i] == 'a')
                {
                odd.add(arr[i]);
                }
                else if(arr[i] == 'e')
                {
                odd.add(arr[i]);
                }
                else if(arr[i] == 'i')
                {
                odd.add(arr[i]);
                }
                else if(arr[i] == 'o')
                {
                odd.add(arr[i]);
                }
                else if(arr[i] == 'u')
                {
                odd.add(arr[i]);
                }
            }
        }
        System.out.println("display the array list");
        System.out.println(even);
        System.out.println(odd); 
    }
}