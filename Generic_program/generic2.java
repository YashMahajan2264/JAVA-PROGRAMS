package Generic_program;
import java.util.*;



class temp<T>
{
    T variable;

    public temp(T variable)
    {
        this.variable=variable;
    }
    void display()
    {
        System.out.println("The type of data is :-"+ variable.getClass().getName());
    }
    public T getVariable()
    {
        return variable;
    }
}

public class generic2 {
    public static void main(String[] args) {
        temp<Integer> t1 =new temp<Integer>(12);
        t1.display();
        t1.getVariable();

        System.out.println("**********************************");

        temp<String> t2=new temp<String>("YASH");
        t2.display();
        t2.getVariable();
    }
    
}
