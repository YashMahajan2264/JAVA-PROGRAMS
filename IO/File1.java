package IO;
import java.io.*;

public class File1 {
    public static void main(String[] args) throws IOException
     {
        File f1 = new File("yash.txt");
        System.out.println(f1.exists());
        //throws IO exception
        f1.createNewFile();
        System.out.println(f1.exists());

        //creation of directory
        File dir = new File("YASH");
        System.out.println(dir.exists());

        dir.mkdir();
        System.out.println(dir.exists());
    }
    
}
