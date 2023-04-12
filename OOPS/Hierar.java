package OOPS;
class Fruit
{
    void eat()
    {
        System.out.println("this is fruit");
    }
}
class Flower extends Fruit
{
    void smell()
    {
        System.out.println(" this is flower");
    }
}
class Vegetable extends Fruit
{
    void cut()
    {
        System.out.println("this is vegetable");
    }

}
public class Hierar
{
    public static void main(String[] args)
    {
        Vegetable ve= new Vegetable();
        ve.cut();
        ve.eat();
    }
}

