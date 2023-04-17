package Abstraction;
abstract class person{
    abstract public void display();
}
class brother extends person
{
    public void display()
    {
        System.out.println("I am his brother");
    }
}
class sister
{
    final public void dis1()
    {
        System.out.println("I am his sister");
    }
}
class Friend extends sister
{

}



public class Abstract_final {
    public static void main(String[] args) {
        Friend fr=new Friend();
        fr.dis1();

        brother br=new brother();
        br.display();

    }
    
}
