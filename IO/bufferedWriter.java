package IO;
import java.io.*;

public class bufferedWriter {
    public static void main(String[] args)throws IOException {
        File dir3 = new File("PWJAVA");
        File file = new File(dir3, "pwskill3.txt");

        FileWriter fw = new FileWriter(file);

        BufferedWriter bd = new BufferedWriter(fw);

        bd.write("YASH");
        bd.newLine();
        bd.write(65);
        char ch[]={'a','b','c','d'};
        bd.newLine();
        bd.write(ch);
        bd.newLine();
        bd.write("MY NAME IS YASH MAHAJAN");

        bd.flush();
        bd.close();

    }
    
}
