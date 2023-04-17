package IO;
import java.io.*;;

public class reading_file {
    public static void main (String[] args)throws Exception {
        File directory = new File("PWJAVA");
        File file = new File(directory, "pwskills.txt");

        FileReader fd = new FileReader(file);
        int i = fd.read();
        while(i!=-1)
        {
            System.out.println(i + "----->"+ (char)i);
            i=fd.read();
        }
    


    }
    
}
