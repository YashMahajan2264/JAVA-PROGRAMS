package java_API;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class for_each {
    public static void main(String[] args) {
        // List<Integer> l1 = new ArrayList<Integer>();
        // l1.add(2);
        // l1.add(5);
        // l1.add(8);
        // l1.add(9);
        // l1.add(10);

        List<Integer> list= Arrays.asList(2,5,8,9,10);
        // for(Object o: list)
        // {
        //     System.out.println(o);
        // }
        //IMP PART BELOW
        list.forEach(n->System.out.println(n));

    }
    
}
