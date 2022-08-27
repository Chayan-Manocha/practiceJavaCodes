import java.util.Scanner;
public class if_else
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
                int age;
        System.out.println("enter the age of the user ");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("you are an adult");
        }
        else
        {
            System.out.println("you are a minor");
        }
    }

}
