package java_API;
import java.util.*;
import java.util.stream.*;



public class stream_api2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,5,6,24,7,9);

        //System.out.println(list);
        // create stream

        // Stream<Integer> streamData = list.stream();
        // //streamData.forEach(n->System.out.println(n));
        // //for performing more operation we create another stream 
        // Stream<Integer> st1 = streamData.sorted();
        // Stream<Integer> st2 = st1.map(n->n*2);
        // Stream<Integer> st3 = st2.filter(n->n%2==0);
        // //printing even number sice multiply by 2 all are even


        // or method
        Stream<Integer> stream = list.stream().sorted().map(n->n*2).filter(n->n%2==0);
        stream.forEach(n->System.out.println(n));
    }
}
