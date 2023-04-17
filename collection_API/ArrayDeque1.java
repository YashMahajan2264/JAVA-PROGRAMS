package collection_API;
import java.util.*;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        ad.add(500);
        ad.add("YASH");
        ad.add(5000);
        ad.addFirst(1);
        ad.addLast(10000);
        ad.offer(500);
        ad.offerLast(500000);
        ad.offerFirst(500);
        System.out.println(ad);
    }
    
}
