package java_API;
//functional  interface
@FunctionalInterface
interface Imp
{
    void display();
    //throw error since functional interface has only one abstract method
    //void display2();
}

//Parent class
@Deprecated
class plane
{
    public void PlanefliesAtGoodHeight()
    {
        System.out.println("Plane is flying at good height");
    }
}
//child class
class cargo extends plane
{
    @Override
    public void PlanefliesAtGoodHeight()
    {
        System.out.println("Cargo plane flying at good height");
    }
}
public class annotation1 {
    public static void main(String[] args) {
        plane pl = new cargo();
        pl.PlanefliesAtGoodHeight();
    }
}
