import java.io.*;
import java.util.Scanner;
class count_in_file_handling
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            String s;
            System.out.println("Enter the string");
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
        int i,count=0;
        char ch;
        while((i=fr.read())!= -1)
        {
            ch=(char)i;
        count+=1;
        }
            System.out.println(count);
        fr.close();
    }
}