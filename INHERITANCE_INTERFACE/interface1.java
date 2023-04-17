package INHERITANCE_INTERFACE;

interface abc{
    void name();
}
class A implements abc
{
    public void name()
    {
        System.out.println("My name is yash");
    }
}
class B implements abc
{
    public void name()
    {
        System.out.println("My name is harshal");
    }
}
class Developer
{
    public void show(abc obj)
    {
        obj.name();
        System.out.println("Program ends");
    }
}

public class interface1 {
    public static void main(String[] args) {
        abc obj=new A();
        abc obj1=new B();
        Developer de=new Developer();
        de.show(obj);
        de.show(obj1);
    }
    
}
