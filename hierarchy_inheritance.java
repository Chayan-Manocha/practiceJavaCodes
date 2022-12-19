import java.util.ArrayList;
import java.util.Scanner;
interface school
{
    public void s_enter();
    public void s_display();
}
class science_stream implements school
{
    int sst_roll_no;
    int sst_age;
    int sst_no_of_years;
    int sst_per_year_charges;
    int sst_total_charges;
    String sst_name;
    int s_id,s_no_of_classes;
    int s_no_of_teachers;
    String s_name;
    String s_city;
    public void s_enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id of the school");
        s_id=sc.nextInt();
        System.out.println("enter the number of classes of the school");
        s_no_of_classes=sc.nextInt();
        System.out.println("enter the number of teachers teaching in the school");
        s_no_of_teachers=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the school");
        s_name=sc.nextLine();
        System.out.println("enter the city of the school");
        s_city=sc.nextLine();
    }
    public void s_display()
    {
        System.out.println(s_id);
        System.out.println(s_no_of_classes);
        System.out.println(s_no_of_teachers);
        System.out.println(s_name);
        System.out.println(s_city);
    }
    void sst_enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Roll number of the student in science stream");
        sst_roll_no=sc.nextInt();
        System.out.println("enter the age of the student in science stream");
        sst_age=sc.nextInt();
        System.out.println("enter the number of years in science stream");
        sst_no_of_years=sc.nextInt();
        System.out.println("enter the per year charges in science stream");
        sst_per_year_charges=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the student in science stream");
        sst_name=sc.nextLine();
    }
    void sst_calc()
    {
        sst_total_charges=sst_no_of_years*sst_per_year_charges;
    }
    void sst_display()
    {
        System.out.println(sst_roll_no);
        System.out.println(sst_name);
        System.out.println(sst_age);
        System.out.println(sst_no_of_years);
        System.out.println(sst_per_year_charges);
        System.out.println(sst_total_charges);
    }
}
class science_diploma implements school
{
    int ssd_id,ssd_age,ssd_percentage_marks,i,n,x;
    String ssd_name;
    ArrayList<Integer> al;
    int s_id,s_no_of_classes,s_no_of_teachers;
    String s_name,s_city;
    public void s_enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id of the school");
        s_id=sc.nextInt();
        System.out.println("enter the number of classes of the school");
        s_no_of_classes=sc.nextInt();
        System.out.println("enter the number of teachers teaching in the school");
        s_no_of_teachers=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the school");
        s_name=sc.nextLine();
        System.out.println("enter the city of the school");
        s_city=sc.nextLine();
    }
    public void s_display()
    {
        System.out.println(s_id);
        System.out.println(s_no_of_classes);
        System.out.println(s_no_of_teachers);
        System.out.println(s_name);
        System.out.println(s_city);
    }
    void ssd_enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id of the student studying in science diploma");
        ssd_id=sc.nextInt();
        System.out.println("enter the age of the student studying in science diploma");
        ssd_age=sc.nextInt();
        System.out.println("enter the number of quarters in science diploma");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the student studying in science diploma");
        ssd_name=sc.nextLine();
        System.out.println("enter the marks obtainde in each quarter of the course");
        al=new ArrayList<Integer>();
        for(i=0;i<n;i++)
        {
            x=sc.nextInt();
            al.add(x);
        }
    }
    void ssd_calc()
    {
        int sum=0;
        for(int j:al)
        {
            sum+=j;
            ssd_percentage_marks=sum/4;
        }

    }
    void ssd_display()
    {
        System.out.println(ssd_id);
        System.out.println(ssd_age);
        System.out.println(ssd_name);
        System.out.println(ssd_percentage_marks);
    }
}
class hierarchy_inheritance
{
    public static void main(String args[])
    {
        science_stream obj1=new science_stream();
        obj1.s_enter();
        obj1.sst_enter();
        obj1.sst_calc();
        obj1.s_display();
        obj1.sst_display();
        science_diploma obj2=new science_diploma();
        obj2.s_enter();
        obj2.ssd_enter();
        obj2.ssd_calc();
        obj2.s_display();
        obj2.ssd_display();
    }
}