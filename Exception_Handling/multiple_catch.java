package Exception_Handling;

public class multiple_catch {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int result =0;
        int arr[]={1,2,3,4,5};
        String name=null;
        try
        {
            result=num1/num2;
            System.out.println(arr[6]);
            System.out.println(name.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero exception");
        }
        catch(ArrayIndexOutOfBoundsException ob)
        {
            System.out.println("Array index out of bound exceeption");
        }
        catch(Exception obj)
        {
            System.out.println("Sometthing wents wrong");
        }
        System.out.println(result);
        System.out.println("Program ends");
    }
    
    
}
