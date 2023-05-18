package MultiThreading;


class test implements Runnable
{
    String res1 = new String("YASH");
    String res2 = new String("MANAS");
    String res3 = new String("PRANAV");

    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name.equals("STUDENT1"))
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("Student 1 has acquired "+res3);
                    Thread.sleep(3000);
                    
                    synchronized(res2)
                    {
                        System.out.println("Student 1 has acquired "+res2);
                        Thread.sleep(3000);

                        synchronized(res1)
                        {
                            System.out.println("Student 1 has acquired "+res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("some problem");
            }
        }
        else
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res2)
                {
                    System.out.println("Student 2 has acquired "+res2);
                    Thread.sleep(3000);
                    
                    synchronized(res3)
                    {
                        System.out.println("Student 2 has acquired "+res3);
                        Thread.sleep(3000);

                        synchronized(res1)
                        {
                            System.out.println("Student 2 has acquired "+res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("some problem");
            }
        }
    }

}

public class dead_lock {
    public static void main(String[] args) {
        test t1=new test();

        Thread th1=new Thread(t1);
        Thread th2=new Thread(t1);

        th1.setName("STUDENT1");
        th2.setName("STUDENT2");
        th1.start();
        th2.start();
    }
    
}
