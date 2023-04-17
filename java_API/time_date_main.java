package java_API;
import java.time.*;

public class time_date_main {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        //System.out.println(dt);

        int day = dt.getDayOfMonth();
        int month = dt.getMonthValue();
        int year = dt.getYear();

        System.out.println(day + "/" + month + "/" + year);

        LocalTime time = LocalTime.now();
        //System.out.println(time);
        int hrs = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nsec = time.getNano();

        System.out.println(hrs + ":" + min + ":" + sec + ":" + nsec);
    }
    
}
