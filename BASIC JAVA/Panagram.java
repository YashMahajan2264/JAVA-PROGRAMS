public class Panagram {
    public static void main(String[] args) {
        String s1="The quick Brown Fox Jumps over lazy dog";
        boolean flag=false;
        s1=s1.replace(" ", "");
        s1=s1.toLowerCase();
        char ar[]=s1.toCharArray();
        int s2[]=new int[26];
        for(int i=0;i<ar.length;i++)
        {
            s2[ar[i]-97]++;
            
        }
        for(int i=0;i<s2.length;i++)
        {
            if(s2[i]==0);
            flag=true;
            System.out.println("String is not panagram");
            break;
        }
        if(flag==false)
        System.out.println("String is panagram");

    }
    
}
