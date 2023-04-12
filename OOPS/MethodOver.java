package OOPS;

public class MethodOver
{
    void add(int a, int b)  // same methods but diff parameters in one class
    {
        System.out.println("addition of two numbers is : " + (a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("addition of the numbers is :" + (a+b+c));
    }

    public static void main(String[] args)
    {
     MethodOver m= new MethodOver();
     m.add(3,3);
     m.add(3,7,9);
    }
}
