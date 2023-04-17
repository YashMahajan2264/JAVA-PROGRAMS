public class Palindrome_first {
    public static void main(String[] args) {
        String str="2552";
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        if(str.equals(str1))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not plaindrome");
        }
    }

    
}
