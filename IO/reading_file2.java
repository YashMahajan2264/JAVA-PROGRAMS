package IO;
import java.io.*;

public class reading_file2 {
    public static void main(String[] args) throws Exception {
        File directory = new File("PWJAVA");
        File file = new File(directory, "pwskills.txt");

        FileReader fd = new FileReader(file);
        char ch[]= new char[(int)file.length()];

        fd.read(ch);

        for(char yash : ch)
        {
            System.out.print(yash);
        }
    }
    
    
}
