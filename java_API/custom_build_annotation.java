package java_API;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    String name() default "dhoni";
    int age() default 41;
}
@CricketPlayer
class dhoni
{
    private int innings;
    private int runs;
    public int getInnings() {
        return innings;
    }
    public void setInnings(int innings) {
        this.innings = innings;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }
    
}

public class custom_build_annotation {
    public static void main(String[] args) {
        dhoni yash_fan = new dhoni();
        yash_fan.setInnings(200);
        yash_fan.setRuns(5000);
        System.out.println(yash_fan.getInnings());
        System.out.println(yash_fan.getRuns());

        // to get annoation values

        Class c = yash_fan.getClass();
        Annotation a = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer)a;
        int at = cp.age();
        System.out.println(at);
        String name1 = cp.name();
        System.out.println(name1);
    }
    
}
