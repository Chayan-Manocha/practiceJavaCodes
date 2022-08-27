import java.util.Scanner;
public class vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character to be examined");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
                System.out.println("Entered character is a vowel");
                break;
            case 'e':
                System.out.println("Entered character is a vowel");
                break;
            case 'i':
                System.out.println("Entered character is a vowel");
                break;
            case 'o':
                System.out.println("Entered character is a vowel");
                break;
            case'u':
                System.out.println("Entered character is a vowel");
                break;
            default:
                System.out.println("Entered character is a consonent");
                break;
        }
    }
}
