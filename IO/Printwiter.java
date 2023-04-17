package IO;
import java.io.*;

public class Printwiter {
    public static void main(String[] args) throws Exception {
        File direc = new File("PWJAVA");
        File fl = new File(direc, "pwskills.txt");

        FileWriter fr = new FileWriter(fl, true);
        //due to true it does not overidde the file
        
        PrintWriter pw =new PrintWriter(fr);

        pw.println("MY HOME TOWN IS DHULE");
        pw.print("MH ");
        pw.println(18);
        pw.println("I HAD BIG CRUSH ON ONE GIRL WHO ARE CAME FROM DIECT SECOND YEAR STUDENT BATCH");

        pw.flush();
        pw.close();
    }
}
