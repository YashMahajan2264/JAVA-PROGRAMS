package Exception_Handling;

import java.util.Scanner;

public class Try_resource {
    public static void main(String[] args) {
        int num=0;
        try(Scanner sc=new Scanner(System.in))
        {
            num=sc.nextInt();
        }
        
        
    }
    
}
