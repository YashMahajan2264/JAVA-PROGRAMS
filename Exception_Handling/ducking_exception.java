package Exception_Handling;

class yash
{
    public void a() throws Exception
    {
        System.out.println("Inside a() function");
        b();
    }
    public void b() throws Exception
    {
        int num1=6;
        int num2=0;
        int result=num1/num2;
        System.out.println("Result:-"+result);
    }
}

public class ducking_exception {
    public static void main(String[] args) {
        yash obj=new yash();
        try
        {
            obj.a();
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid number");
        }
    }
    
}
