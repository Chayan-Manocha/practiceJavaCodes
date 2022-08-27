import java.util.Scanner;
public class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double length,breadth;
        System.out.println("enter the value of length of the quadrilateral");
        length=sc.nextDouble();
        System.out.println("enter the breadth of the given quadrilateral");
        breadth=sc.nextDouble();
        if(length==breadth)
        {
            System.out.println("the given quadrilateral is a square with side equal to " +length);
        }
        else
        {
            System.out.println("the given quadrilateral is not a square ");
        }
    }

}
