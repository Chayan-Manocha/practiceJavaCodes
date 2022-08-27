import java.util.Scanner;
public class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
                double a,b,a_of_square,a_of_rectangle,a_of_triangle;
        System.out.println("enter the value of first side ");
        a=sc.nextDouble();
        System.out.println("enter the value of second side ");
        b=sc.nextDouble();
        a_of_square=a*b;
        a_of_rectangle=a*b;
        a_of_triangle=0.5*(a*b);
        System.out.println("area of square is " +a_of_square);
        System.out.println("area of rectangle is " +a_of_rectangle);
        System.out.println("area of triangle is " +a_of_triangle);
    }
}
