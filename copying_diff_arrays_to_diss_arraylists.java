import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.Line;

import java.util.ArrayList;
class copying_diff_arrays_to_diss_arraylists
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        char a;
        String k;
        String arr[];
        arr=new String[100];
        ArrayList<String>al_1;
        al_1=new ArrayList<String>();
        ArrayList<String>al_2;
        al_2=new ArrayList<String>();
        ArrayList<String>al_3;
        al_3=new ArrayList<String>();
        ArrayList<String>al_4;
        al_4=new ArrayList<String>();
        System.out.println("enter the value of n");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the array value");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        System.out.println("copy elements starting with upper case");
        for (int j=0;j<n;j++)
        {
            k=arr[j];
            a=k.charAt(0);
            if(Character.isUpperCase(a))
            {
                al_1.add(k);
            }
             if(Character.isLowerCase(a))
            {
                al_2.add(k);
            }
            else if(Character.isDigit(a))
            {
                al_3.add(k);
            }
            else 
            {
                al_4.add(k);
            }
        }
        System.out.println("displaying the array list whose elements are starting with upper case");
        for(String x:al_1)
        {
            System.out.println(x);
        }
        System.out.println("displaying the array list whose elements are starting with lower case");
        for(String x:al_2)
        {
            System.out.println(x);
        }
        System.out.println("displaying the array list whose elements are starting with digit");
        for(String x:al_3)
        {
            System.out.println(x);
        }
        System.out.println("displaying the array list whose elements are starting with spl case");
        for(String x:al_4)
        {
            System.out.println(x);
        }
    }    
  
}