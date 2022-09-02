import java.util.Scanner;
class factorial_of_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,product;
        product=1;
        for(i=5;i>=1;i--)
    {
            product*=i;
    }
    System.out.println(product);
    }
}