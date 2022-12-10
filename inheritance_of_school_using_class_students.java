import java.util.Scanner;
interface school
{
    public void s_enter();
    public void s_display();
}
class student implements school
{
    int section,roll_no,age;
    float fees;
    String name;
    int s_id,no_of_students,no_of_classes,no_of_teachers;
    String city,s_name;
    public void s_enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the section in which the student studies");
        section=sc.nextInt();
        System.out.println("Enter the roll number of the student");
        roll_no=sc.nextInt();
        System.out.println("Enter the age of the student");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the student");
        name=sc.nextLine();
        System.out.println("Enter the fees of the student");
        fees=sc.nextFloat();
    }
    public void s_display()
    {
        System.out.println(roll_no);
        System.out.println(name);
        System.out.println(age);
        System.out.println(section);
        System.out.println(fees);
    }
    void st_enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id of the school");
        s_id=sc.nextInt();
        System.out.println("Enter the number of students studying in the school");
        no_of_students=sc.nextInt();
        System.out.println("Enter the number of teachers teaching in the school");
        no_of_teachers=sc.nextInt();
        System.out.println("Enter the number of classes in the school");
        no_of_classes=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the city of the school");
        city=sc.nextLine();
        System.out.println("Enter the name of the school");
        s_name=sc.nextLine();
    }
    void st_display()
    {
        System.out.println(s_id);
        System.out.println(no_of_students);
        System.out.println(no_of_teachers);
        System.out.println(no_of_classes);
        System.out.println(city);
        System.out.println(s_name);
    }
}
class inheritance_of_school_using_students
{
    public static void main(String args[])
    {
    student obj=new student();
    obj.s_enter();
    obj.st_enter();
    obj.s_display();
    obj.st_display();
}
}