import java.util.Scanner;
interface doctor
{
    public void d_enter();
    public void d_display();
}
interface hosplital extends doctor
{
    public void h_enter();
    public void h_display();
}
class patient implements hosplital
{
    int patient_id;
    int patient_age;
    int patient_number_of_days_rested_in_hospital;
    int per_day_charges;
    int total_payable_charge;
    int number_of_medicines;
    String patient_name;
    String disease_name;

    int d_id;
    int no_of_years_of_experience;
    String d_name;
    String d_specialisation;

    int h_id;
    int no_of_beds_in_hospital;
    int no_of_doctors_in_hospital;
    String h_name;
    String h_city;
    String room_category;

    public void d_enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id of the doctor");
        d_id=sc.nextInt();
        System.out.println("enter the number of years of experience of the doctor");
        no_of_years_of_experience=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the doctor");
        d_name=sc.nextLine();
        System.out.println("enter the specialisation of the doctor");
        d_specialisation=sc.nextLine();
    }
    public void d_display()
    {
        System.out.println("id of the doctor is "+ d_id);
        System.out.println("number of years of experience of the doctor is "+ no_of_years_of_experience);
        System.out.println("name of the doctor is "+ d_name);
        System.out.println("specialisation of the doctor is "+ d_specialisation);
    }

    public void h_enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id of the hospital");
        h_id=sc.nextInt();
        System.out.println("enter the number of beds present in the hospital");
        no_of_beds_in_hospital=sc.nextInt();
        System.out.println("enter the number of doctors in the hospital");
        no_of_doctors_in_hospital=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the hospital");
        h_name=sc.nextLine();
        System.out.println("enter the city of the hospital");
        h_city=sc.nextLine();
        System.out.println("enter the category of room present in the hospital");
        room_category=sc.nextLine();
    }
    public void h_display()
    {
        System.out.println("the id of the hospital is "+ h_id);
        System.out.println("the number of beds in the hospital are "+ no_of_beds_in_hospital);
        System.out.println("the number of doctors in the hospital are "+ no_of_doctors_in_hospital);
        System.out.println("the name of the hospital is "+ h_name);
        System.out.println("the city in which the hospital is is "+ h_city);
        System.out.println("the id of the hospital is "+ h_id);
    }
    void p_enter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id of the patient");
        patient_id=sc.nextInt();
        System.out.println("enter the age of the patient");
        patient_age=sc.nextInt();
        System.out.println("enter the number of days the patient has taken rest in the hospital");
        patient_number_of_days_rested_in_hospital=sc.nextInt();
        System.out.println("enter the per day charges charged by the hospital");
        per_day_charges=sc.nextInt();
        System.out.println("enter the number of medicines of the patient");
        number_of_medicines=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the name of the patient");
        patient_name=sc.nextLine();
        System.out.println("enter the name of the disease");
        disease_name=sc.nextLine();
    }
    void p_calc()
    {
        total_payable_charge=per_day_charges*patient_number_of_days_rested_in_hospital;
    }
    void p_display()
    {
        System.out.println("the id of the patient is "+patient_id);
        System.out.println("the age of the patient is "+patient_age);
        System.out.println("the number of days the patient has taken rest in the hospital are "+patient_number_of_days_rested_in_hospital);
        System.out.println("the per day charges of the hospital are "+per_day_charges);
        System.out.println("the number of medicines of the patient are "+number_of_medicines);
        System.out.println("the name of the patient is "+patient_name);
        System.out.println("the name of the disease  is "+disease_name);
        System.out.println("the total amout to be paid by the patient is "+total_payable_charge);
    }
}
class multilevel_interface_doctor_hospital_and_patient
{
    public static void main(String args[])
    {
        patient obj=new patient();
        obj.d_enter();
        obj.d_display();
        obj.h_enter();
        obj.h_display();
        obj.p_enter();
        obj.p_calc();
        obj.p_display();
    }
}