package java_API;
enum Result1
{
    PASS,FAIL,NR;
}
public class enum_switchcase {
    public static void main(String[] args) {
        Result1 rt = Result1.PASS;

        switch(rt)
        {
            case PASS: System.out.println("PASS");
            break;
            case FAIL: System.out.println("FAIL");
            break;
            case NR: System.out.println("NO RESUKT YET");
            break;
        }
    }
}
