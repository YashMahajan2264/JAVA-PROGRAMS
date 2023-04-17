package collection_API;
import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add(20);
        l1.add(40);
        l1.add(60);
        l1.addFirst(10);
        l1.addLast(70);
        l1.add(3, 30);
        System.out.println(l1);
        System.out.println("******************************");
        LinkedList l2=new LinkedList();
        l2.add("YASH");
        l2.add("MAHAJAN");
        l2.add(1, "GOKUL");
        System.out.println(l2);
        System.out.println("******************************");
        l1.add(l2);
        System.out.println("*****************************");
        System.out.println(l1.peek());
        System.out.println(l1);
        System.out.println("*****************************");
        l1.poll();
        System.out.println(l1);
        System.out.println(l1.get(5));
        System.out.println(l1.indexOf(40));
        l1.add(40);
        System.out.println("*****************************");
        System.out.println(l1);
        System.out.println(l1.lastIndexOf(40));
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
    }
    
}
