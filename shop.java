import java.util.Scanner;
public class shop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int quantity,total_amount;
        double payable_amount;
        System.out.println("enter the quantity of units to be purchased ");
        quantity=sc.nextInt();
        total_amount=quantity*100;
        if(total_amount>1000)
        {
            payable_amount = total_amount*0.1;
        }
        else {
            payable_amount=total_amount;
        }
        System.out.println("the payable amount for your purchase is " +payable_amount);
    }

}
