package java_API;
enum Result
{
    PASS,FAIL,NR;
    int marks;

    Result()
    {
        System.out.println("Constructor in enum");
    }

    public void setMarks(int marks)
    {
        this.marks=marks;
    }

    public int getMarks()
    {
        return marks;
    }

}

public class enum2 {
    public static void main(String[] args) {
        Result.PASS.setMarks(99);
        int t =  Result.PASS.getMarks();
        System.out.println(t);
        //since three pre-defined constsant in enum so three time constructor is called

        int m =Result.FAIL.getMarks();
        System.out.println(m);
    }
}
