import java.util.Scanner;
class throw_case_exception_handeling
{
    public static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("you are not eligible to vote");
        }
        else
        {
            System.out.println("you are eligible to vote");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("enter the age of the person to be validated");
        age=sc.nextInt();
        try
        {
          validate(age);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}