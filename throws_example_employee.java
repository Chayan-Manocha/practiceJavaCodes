import java.util.Scanner;
class employee
{
    int emp_id,age;
    double salary,total_salary;
    String name;
    void enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        name=sc.nextLine();
        System.out.println("Enter the age of the employee");
        age=sc.nextInt();
        System.out.println("Enter the salry of the employee");
        salary=sc.nextDouble();
    }
    void assign() throws ArithmeticException
    {
        if(salary<0)
        {
            throw new ArithmeticException("Salary of an employee cannot be negative");
        }
        else
        {
            total_salary=0.9*salary;
        }
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(total_salary);
    }
}
class throws_example_employee
{
    public static void main(String args[])
    {
        try
        {
            employee obj=new employee();
            obj.enter();
            obj.assign();
            obj.display();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}