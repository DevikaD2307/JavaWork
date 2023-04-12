package OOPS;

abstract class Book  // abstract class
{
    abstract void read();   // abstract method
    public void write()
    {
        System.out.println("this is norml method");
    }

}
class Paper extends Book
{
    public void read() // implementting abstract method in sub class
    {
        System.out.println("im writing");
    }

}
class Abstr
{
    public static void main(String[] args)
    {
        Paper pe= new Paper();
        pe.read();
        pe.write();
    }
}










