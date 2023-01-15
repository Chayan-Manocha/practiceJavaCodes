import java.io.*;
import java.util.Scanner;
class upeer_lower_digit_in_file_handling
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            String s;
            System.out.println("Enter the string to be entered in the text file");
            s=sc.nextLine();
            FileWriter fw=new FileWriter("abc.txt");
            fw.write(s);
            fw.close();
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }
        FileReader fr=new FileReader("abc.txt");
        int i,count_1=0,count_2=0,count_3=0,count_4=0;
        char ch;
        while((i=fr.read())!=-1)
        {
            ch=(char)i;
            if(Character.isUpperCase(ch))
            {
                count_1+=1;
            }
            else if(Character.isLowerCase(ch))
            {
                count_2+=1;
            }
            else if(Character.isDigit(ch))
            {
                count_3+=1;
            }
            else 
            {
                count_4+=1;
            }
        }
            System.out.println("upper case alphabets are " + count_1);
            System.out.println("lower case alphabets are " + count_2);
            System.out.println("digits are " + count_3);
            System.out.println("spl case alphabets are " + count_4);
        fr.close();
    }
}