package Generic_program;

import java.util.*;

class Student
{
    private int age;
    private String name;
}
class Employee
{
    private int salary;
}

public class generic1 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("YASH");
        al.add("MANAS");
        al.add("PRANAV");
        //al.add(10) // give error

        String st=al.get(0);
        //no need of typecastring

        System.out.println(al);

        ArrayList<Student> al2=new ArrayList<Student>();
        ArrayList<Employee> al3=new ArrayList<Employee>();

        Student s = new Student();
        Employee et = new Employee();

        al2.add(s);
        //al2.add(et);
        al3.add(et);

    }
    
}
