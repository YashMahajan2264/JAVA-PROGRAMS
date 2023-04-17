package Exception_Handling;

public class first_exception {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result =0;
        try
        {
            result=num1/num2;
            System.out.println("Try block ends");
        }
        catch(Exception obj)
        {
            System.out.println("Sometthing wents wrong"+obj);
        }
        System.out.println(result);
        System.out.println("Program ends");
    }
    
}
