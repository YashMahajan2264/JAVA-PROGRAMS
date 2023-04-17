package Generic_program;
import java.util.*;



class Teacher
{
    public int age;
    public String name;
    public float salary;

    public Teacher(int age,String name,float salary)
    {
        this.age=age;
        this.name=name;
        this.salary=salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
    public String toString()
    {
        return name+" "+age+" "+salary;
    }

}

public class generic_annonymous {
    public static void main(String[] args) {
        Teacher t1=new Teacher(55, "SUMEDH", 550000);
        Teacher t2=new Teacher(44,"JADHAV", 100000);
        Teacher t3=new Teacher(59, "ATHAVALE", 150000);

        ArrayList<Teacher> t = new ArrayList<Teacher>();
        t.add(t1);
        t.add(t2);
        t.add(t3);

        System.out.println(t);
        //Annoynoumus class comparator which is functional interface through lambda expression

        Comparator<Teacher> cmp=(Teacher a,Teacher b)->
        {
            if(a.age > b.age)
            return 1;
            else
            return -1;
        };
        System.out.println("***********************************");
        Collections.sort(t, cmp);
        System.out.println("Sorting Based on Age:-"+t);
        // or method

        Collections.sort(t, (Teacher a,Teacher b)->
        {
            if(a.salary > b.salary)
            return 1;
            else
            return -1;
        });
        System.out.println("****************************");
        System.out.println("Sorting based on salary:-"+t);
    }
    
}
