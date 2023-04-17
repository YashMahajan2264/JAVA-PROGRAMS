package MultiThreading;

public class main_thread {
    public static void main(String[] args) {
        System.out.println("Main Thread :");
        System.out.println("Before changing name:");
        String st = Thread.currentThread().getName();
        System.out.println("The name of main thread is "+st);
        System.out.println("The priority of thread is "+Thread.currentThread().getPriority());

        System.out.println("After changing the name:");
        Thread t = Thread.currentThread();
        t.setName("yash");
        t.setPriority(1);
        String st2 = Thread.currentThread().getName();
        System.out.println("The name of thread is "+st2);
        System.out.println("The priority of thread is "+Thread.currentThread().getPriority());
        


    }
    
}
