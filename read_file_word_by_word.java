import java.io.*;
import java.util.Scanner;
class read_file_word_by_word
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
            int i;
            sl=br.readLine();
            String[] w=sl.split("\\s+");
            for(i=0;i<w.length;i++)
            {
                System.out.println(w[i]);
            }
            fr.close();
        }
            catch (Exception e)
            {
                System.out.println(e);
            }
    }
} 