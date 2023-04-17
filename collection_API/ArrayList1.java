package collection_API;
import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(500);
        System.out.println(a1);
        System.out.println("***************************");
        ArrayList a2=new ArrayList();
        a2.add("YASH");
        a2.add("MAHAJAN");
        a2.add(19);
        a2.add("YEARS OLD");
        a2.add(9.7);
        System.out.println(a2);;
        System.out.println("******************************");
        a1.add(a2);
        System.out.println(a1);
        System.out.println("******************************");
        ArrayList a3=new ArrayList();
        a3.add(1);
        a3.add(2);
        a3.add(4);
        System.out.println(a3);
        System.out.println("******************************");
        a3.add(2,3);
        System.out.println(a3);
    }
    
}
