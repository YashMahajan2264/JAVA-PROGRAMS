package java_API;

public class Time_date1 {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        // import java.util.date at header and then 
        // create Date dt = new Date();
        System.out.println(dt);
        
        // or
        long time1 = dt.getTime();
        java.sql.Date dt1 = new java.sql.Date(time1);
        System.out.println(dt1);
    }
    
}
