package collection_API;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1, "Yash");
        hm.put(2, "Manas");
        hm.put(3, "Pranav");
        System.out.println(hm);

        Map hm1 = new HashMap();
        hm1.put(1, "ramesh");
        hm1.put(2,"rahul");
        hm1.put(3, "rohit");
        hm1.put(4,"rohan");
        System.out.println("Key 4 has value= "+hm1.get(4));

        Set s=hm1.keySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Integer i=(Integer)itr.next();
            System.out.println("Key is "+ i);
        }
        Collection c =hm1.values();
        Iterator itr1=c.iterator();
        while(itr1.hasNext())
        {
            String st=(String)itr1.next();
            //Object obj =itr.next();
            System.out.println("Values is "+st);
        }
        Set  set=hm1.entrySet();
        Iterator itr2 =set.iterator();
        while(itr2.hasNext())
        {
            Object obj=itr2.next();
            System.out.println(obj);
           // Map.Entry etr =(Entry)itr2.next();


        }


    }
    
}
