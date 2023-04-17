
package Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class finally_block {
    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        try
        {
            num=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter the number");
        }
        finally
        {
            sc.close();
        }
        System.out.println("Number:-"+num);
    }
    
}
