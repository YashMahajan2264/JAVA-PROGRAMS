package collection_API;
import java.util.*;
import java.util.Map.*;

import javax.swing.plaf.synth.SynthUI;
class Student
{
    private Integer age;
    private String name;
    private String city;

    public Student(Integer age, String name,String city)
    {
        this.age=age;
        this.name=name;
        this.city=city;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String toString()
    {
        return name + ":"+age+":"+city;
    }

}

public class HashMap2 {
    public static void main(String[] args) {
        Student st1 =new Student(20, "YASH", "DHULE");
        Student st2=new Student(20,"MANAS","PUNE");
        Student st3=new Student(21, "PRANAV","PIMPRI");

        Map mp=new HashMap();
        mp.put(1, st1);
        mp.put(2, st2);
        mp.put(3, st3);
        System.out.println(mp);
        

        Set st=mp.entrySet();
        Iterator itr= st.iterator();

        while(itr.hasNext())
        {
            Map.Entry et= (Entry)itr.next();
            System.out.println("Key="+et.getKey()+"Value="+et.getValue());
        }


    }
}
