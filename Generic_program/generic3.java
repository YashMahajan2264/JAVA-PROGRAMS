package Generic_program;

import java.util.ArrayList;
import java.util.Collections;

public class generic3 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(55);
        al.add(20);
        al.add(80);
        al.add(23);
        al.add(56);

        System.out.println(al);
        System.out.println("********************");

        Collections.sort(al);
        System.out.println(al);
        System.out.println("********************");

        int index=Collections.binarySearch(al, 80);
        System.out.println("Index ="+index);
        System.out.println("********************");

        Collections.rotate(al, 55);
        System.out.println(al);
        System.out.println("********************");
        
        Collections.shuffle(al);
        System.out.println(al);
        System.out.println("********************");
        System.out.println(Collections.frequency(al, 56));
        
    }
    
}
