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

public class Abstract {
    public static void main(String[] args) {
        brother br=new brother();
        br.display();
        
    }
    
}
