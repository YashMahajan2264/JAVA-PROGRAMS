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
    

    
}

 public class seiralization {
    public static void main(String[] args) throws Exception{

        Cricketer yash =  new Cricketer(20, "YASH", 5000);

        FileOutputStream fos = new FileOutputStream("PWJAVA\\pwskill2.txt");

        BufferedOutputStream oos = new BufferedOutputStream(fos);

        ObjectOutputStream os = new ObjectOutputStream(oos);
        os.writeObject(yash);

        os.flush();
        os.close();


        
    }
    
}