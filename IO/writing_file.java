package IO;
import java.io.*;

public class writing_file {
    public static void main(String[] args)throws IOException {
        //refering to the existing direcctory
        File dir1 = new File("PWJAVA");
        File file = new File(dir1,"pwskills.txt");

        FileWriter fw = new FileWriter(file);
        fw.write("MY NAME IS YASH GOKUL MAHAJAN");
        fw.write("\n");
        fw.write("I AM 20 YEARS OLD HANDSOME BOY");
        fw.write("\n");
        char ch[]={'y','a','s','h',' ','m','a','h','a','j','a','n'};
        fw.write(ch);

        fw.close();
        System.out.println("To see the result open pwskills.txt file");
        // or fw.flush();

    }
}
