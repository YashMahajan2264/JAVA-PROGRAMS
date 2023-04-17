package MultiThreading;
import java.util.*;
class MyThread extends Thread
{
    public void run()
    {
        String s1=Thread.currentThread().getName();
        if(s1.equals("CALC"))
        {
            calc();
        }
        else
        {
            print();
        }
    }
    public void calc()
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
    public void print()
    {
        System.out.println("******Displaying message task*******");
        for(int i=0;i<3;i++)
        {
            System.out.println("Focus is more important to get successfull in your life");
        }
        System.out.println("*******Displaying task ended*********");
    }
}

public class multi_threading3 {
    public static void main(String[] args) {
        System.out.println("****Main thread started****");
        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        m1.setName("CALC");
        m2.setName("PRINT");
        m1.start();
        m2.start();
    }
    
}
