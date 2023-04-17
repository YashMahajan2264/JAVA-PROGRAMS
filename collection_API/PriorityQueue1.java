package collection_API;
import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        System.out.println("****priorityqueue internally follows min-heap data structures*****");
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(175);
        pq.add(125);
        pq.add(75);
        System.out.println("********************************");
        System.out.println(pq);
        System.out.println("***Duplicates are not alloewd  in pq****");
        System.out.println(pq.contains(150));
        System.out.println(pq.isEmpty());
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq);
    }
}
