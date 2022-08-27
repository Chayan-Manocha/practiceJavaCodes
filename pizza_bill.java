import java.util.Scanner;
public class pizza_bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no_of_pizza;
        String pizza_type,pizza_size;
        double prize_per_pizza,total_amount,payable_amount;
        System.out.println("MAIN MENU");
        System.out.println("Pizza Type          Price Per Pizza");
        System.out.println("Farmhouse Pizza          150/-");
        System.out.println("Corn Pizza               175/-");
        System.out.println("Tomato Onion Pizza       125/-");
        System.out.println("Cheese                   225/-");
        System.out.println("Enter the number of pizzas to be ordered");
        no_of_pizza=sc.nextInt();
        System.out.println("Enter the type of pizza");
        pizza_type=sc.next();
        if(pizza_type == "Farmhouse Pizza")
        {
            total_amount=150*no_of_pizza;
        } else if (pizza_type == "Corn Pizza")
        {
            total_amount=175*no_of_pizza;
        } else if (pizza_type == "Tomato Onion Pizza")
        {
            total_amount=125*no_of_pizza;
        }
        else
        {
            total_amount=225*no_of_pizza;
        }
        System.out.println("Enter the size of pizza");
        pizza_size= sc.next();
        if (pizza_size == "Large")
        {
            payable_amount=2*total_amount;
        }
        else if (pizza_size == "medium")
        {
            payable_amount=100+total_amount;
        }
        else
        {
            payable_amount=total_amount;
        }
        System.out.println("The payable amount of your bill is " +payable_amount);
    }
}
