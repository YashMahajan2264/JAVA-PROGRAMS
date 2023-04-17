package collection_API;
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(500);
        System.out.println(a1);
        System.out.println(a1.contains(200));
        int index=a1.indexOf(500);
        System.out.println("INDEX"+index);
        System.out.println("SIZE:-"+a1.size());
        a1.ensureCapacity(20);
        a1.trimToSize();
        System.out.println("SIZE:-"+a1.size());
        a1.clear();
        System.out.println(a1);
        List a2=new ArrayList();
        a2.add(2);
        a2.add(4);
        a2.add(6);
        System.out.println("************************");
        System.out.println(a2);
    }
    
}
