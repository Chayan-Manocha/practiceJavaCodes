import java.util.Scanner;
public class age
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int age;
         System.out.println("enter your age ");
         age=sc.nextInt();
         if(age>=18)
         {
             if (age>=60)
             {
                 System.out.println("senior Citizen");
             }
             else {
                 System.out.println("Adult");
             }
         }
         else{
             if(age>=16)
             {
                 System.out.println("Minor");
             }
             else{
                 System.out.println("Kid");
             }
         }
     }
}
