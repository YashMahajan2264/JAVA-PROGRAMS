public class Reversing_string {
    public static void main(String[] args) {
        String s1="AAKASH";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        System.out.println("Before reversing :-"+ s1);
        System.out.println("After reversing :-"+ s2);
    }
    
}
