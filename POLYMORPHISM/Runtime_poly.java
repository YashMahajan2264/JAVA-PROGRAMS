package POLYMORPHISM;
class Person
{
    public void  name()
    {
        System.out.println("Person name is yash mahajan");
    }
    public void age()
    {
        System.out.println("person age is 20");
    }
}
class Friend extends Person
{
    public void  name()
    {
        System.out.println("Friend name is harshal nikam");
    }
    public void age()
    {
        System.out.println("Friend age is 20");
    } 
}
class Brother extends Person
{
    public void  name()
    {
        System.out.println("Brother name is aakash mali");
    }
    public void age()
    {
        System.out.println("Brother age is 20");
    }
}
class Polymorphism1
{
    public void poly(Person ab)
    {
        ab.name();
        ab.age();
        System.out.println("-------******-------");
    }
}

public class Runtime_poly {
    public static void main(String[] args)
     {
        Friend fb=new Friend();
        Brother bb=new Brother();
        Polymorphism1 pb=new Polymorphism1();
        pb.poly(fb);
        pb.poly(bb);
    }



    
}
