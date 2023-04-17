package java_API;

enum week
{
    MON , TUE , WED , THI , FRI , SAT , SUN
}

public class enum1 {
    public static void main(String[] args) {
        week w = week.MON;
        //System.out.println(w);

        // int index = w.ordinal();
        // System.out.println(index);t
        

        week wr[] = week.values();
        for(week wt : wr)
        {
            System.out.println(wt+" : "+wt.ordinal());
        }
    }
    
}
