import java.io.*;
import java.util.Scanner;
class upper_vovel_in_file_handling
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            String s;
            System.out.println("enter the string to be written in text file");
            s=sc.nextLine();
            FileWriter fw=new FileWriter("abc.text");
            fw.write(s);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        FileReader fr=new FileReader("abc.txt");
        int i,count_1=0,count_2=0,count_3=0,count_4=0,count_5=0,count=0;
        char ch;
        while((i=fr.read())!=-1)
        {
            ch=(char)i;
            if(Character.isUpperCase(ch) && ch=='A')
            {
                count_1+=1;
            }
            else if(Character.isUpperCase(ch) && ch=='E')
            {
                count_2+=1;
            }
            else if(Character.isUpperCase(ch) && ch=='I')
            {
                count_3+=1;
            }
            else if(Character.isUpperCase(ch) && ch=='O')
            {
                count_4+=1;
            }
            else if(Character.isUpperCase(ch) && ch=='U')
            {
                count_5+=1;
            }
        }
        count=count_1+count_2+count_3+count_4+count_5;
        System.out.println("count of characters with alphabet and are upper case is " + count);
        fr.close();
    }
}