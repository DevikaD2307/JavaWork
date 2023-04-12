package JavaBasics;

public class Instance
{
    void hello()
    {
        int age=20;
        System.out.println(age);
    }

    public static void main(String[] args) {
        Instance obj= new Instance();
        obj.hello();
    }
}
