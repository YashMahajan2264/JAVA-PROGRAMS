package MultiThreading;
import java.util.Scanner;

class Mythread1 extends Thread
{
    public void run()
    {
        System.out.println("*****Calculation Task******");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:-");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:-");
        int num2=sc.nextInt();
        int result=num1/num2;
        System.out.println("The result is "+result);
        System.out.println("******The Calculation task end******");
        sc.close();
    }
}
class Mythread2 extends Thread
{
    public void run()
    {
        System.out.println("******Displaying message task*******");
        for(int i=0;i<3;i++)
        {
            System.out.println("Focus is more important to get successfull in your life");
        }
        System.out.println("*******Displaying task ended*********");
    }
}

public class creating_thread1 {
    public static void main(String[] args) {
        System.out.println("The main thread is here");
        Mythread1 y1=new Mythread1();
        Mythread2 y2=new Mythread2();
        y1.start();
        y2.start();
    }
    
}
