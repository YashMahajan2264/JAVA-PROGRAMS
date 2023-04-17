package MultiThreading;
class yash implements Runnable
{
    public void run()
    {
        try{
            System.out.println("finds the car and entere into it");
            Thread.sleep(3000);

            synchronized(this)
            {
            System.out.println("Starts to drive the car");
            Thread.sleep(3000);
            System.out.println("return and park the car");
            Thread.sleep(3000);
            
            }
        }
        catch(Exception e)
        {
            System.out.println("something problematic");
        }
    }
}

public class synchronized_method {
    public static void main(String[] args) {
        yash y1 = new yash();
        Thread t1 = new Thread(y1);
        Thread t2 = new Thread(y1);
        Thread t3 = new Thread(y1);

        t1.setName("1st Son");
        t2.setName("2nd Son");
        t3.setName("3rd Son");

        t1.start();
        t2.start();
        t3.start();
    }
}
