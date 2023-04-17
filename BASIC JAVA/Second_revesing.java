public class Second_revesing {
    public static void main(String[] args) {
        String s1="AAKASH MALI";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        String s3[]=s2.split(" ", 0);
        String s4="";
        for(int j=0;j<s3.length;j++)
        {
            s4=s3[j]+" "+s4;
        }
        System.out.println("Before reversing :-"+s1);
        System.out.println("After reversing :-"+s4);
    }
    
}
