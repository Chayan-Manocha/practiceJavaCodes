import java.util.Scanner;
public class else_if_else
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double maths,eng,phy,chem,bio,percentage;
        char grade;
        System.out.println("enter the marks obtained in maths");
        maths=sc.nextDouble();
        System.out.println("enter the marks obtained in english");
        eng=sc.nextDouble();
        System.out.println("enter the marks obtained in physics");
        phy=sc.nextDouble();
        System.out.println("enter the marks obtained in chemistry");
        chem=sc.nextDouble();
        System.out.println("enter the marks obtained in biology");
        bio= sc.nextDouble();
        percentage=(maths+eng+phy+chem+bio)/5;
        if(percentage>=90)
        {
            grade='A';
        }
        else if (percentage>=75 && percentage<=89)
        {
            grade='B';
        }
        else if (percentage>=60 && percentage<=74)
        {
            grade='C';
        }
        else if (percentage>=50 && percentage<=59)
        {
            grade='D';
        }
        else
        {
            grade='F';
        }
        System.out.println("your grade is " +grade);
    }

}
