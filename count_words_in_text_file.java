import java.io.*;
import java.util.Scanner;
class count_words_in_text_file
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            String s;
            System.out.println("enter the string to be entered in the text file");
            s=sc.nextLine();
            FileWriter fw=new FileWriter("abc.txt");
            fw.write(s);
            fw.close();
            FileReader fr=new FileReader("abc.txt");
            BufferedReader br=new BufferedReader(fr);
            String sl;
            int i,count=0;
            sl=br.readLine();
            String[] w=sl.split("\\s+");
            for(i=0;i<w.length;i++)
            {
                count+=1;
            }
            System.out.println(count);
            fr.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}