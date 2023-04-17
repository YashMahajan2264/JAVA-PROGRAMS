package java_API;
import java.util.*;
import java.util.stream.*;

public class stream_api {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,7,9,4,6,1);

        //Seperate stream is created which doesnt affect original data
        Stream<Integer> strdata= list.stream();
        strdata.forEach(n->System.out.println(n));
    }
}
