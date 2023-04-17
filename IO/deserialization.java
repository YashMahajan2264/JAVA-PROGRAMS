package IO;
import java.io.*;

class Cricketer implements Serializable
{
    private int age;
    private String name;
    private int runs;
    public Cricketer(int age, String name, int runs) {
        this.age = age;
        this.name = name;
        this.runs = runs;
    }
    public void display()
    {
        System.out.println(name+" "+age+" "+runs);
    }

    
}

public class deserialization {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("PWJAVA\\pwskill2.txt");

        ObjectInputStream iis = new ObjectInputStream(fis);

        Cricketer cs = (Cricketer)iis.readObject();
        cs.display();
        iis.close();

    }
    
}
