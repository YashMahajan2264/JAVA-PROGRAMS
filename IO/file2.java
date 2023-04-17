package IO;
import java.io.*;

public class file2 {
    public static void main(String[] args) throws IOException
    {
        File dir = new File("PWJAVA");
        //System.out.println(dir.isDirectory());

        dir.mkdir();
        System.out.println("dir is refering to the directory name PWJAVA :-"+dir.isDirectory());

        //creating the file inside the Directory

        File f1 = new File(dir,"Pwsills.txt");
        //throws IOException
        f1.createNewFile();
        System.out.println("f1 is refering to the new file pwskill.txt in PWJAVA directory :-"+f1.isFile());

        File f2 = new File(dir,"pwskill2.txt");
        File f3 = new File(dir,"pwsill3.txt");
        f2.createNewFile();
        
        f3.createNewFile();

        //counting the total number of file 

        int count = 0;
        File file= new File("PWJAVA");
        String str[] = file.list();

        for(String name : str)
        {
            count++;
            System.out.println(name+" ");
        }
        System.out.println("The total number of file in PWJAVA directory is:- "+ count);


    }
    
}
