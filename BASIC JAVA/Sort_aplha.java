import java.util.Arrays;

public class Sort_aplha {
    public static void main(String[] args) {
        String s1="Yash";
        s1=s1.toLowerCase();
        char s2[]=s1.toCharArray();
        Arrays.sort(s2);
        System.out.println("After sorting :- ");
        for(int i=0;i<s2.length;i++)
        {
            System.out.print(s2[i]);
        }
    }
    
}
