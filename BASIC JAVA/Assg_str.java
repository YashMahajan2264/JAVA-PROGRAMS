public class Assg_str {
    public static void main(String[] args) {
        String str="Hello, have a good day";
        char ch[]= new char[30];
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='A' ||
             str.charAt(i)=='e' || str.charAt(i)=='E'
              || str.charAt(i)=='i' || str.charAt(i)=='I' 
              || str.charAt(i)=='o' || str.charAt(i)=='O'
               || str.charAt(i)=='u' || str.charAt(i)=='U') 
            {
                ch[j++]=str.charAt(i);
            }
            else
            {
                continue;
            }

        }
        for(int i=0;i<j;i++)
        {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
    
}