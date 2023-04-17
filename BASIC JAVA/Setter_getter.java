class Yash {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

    
}
public class Setter_getter
{
    public static void main(String[] args) {
        Yash obj = new Yash();
        obj.setAge(19);
        obj.setName("yash");
        int a=obj.getAge();
        String b=obj.getName();
        System.out.println(a+b);

    }
}