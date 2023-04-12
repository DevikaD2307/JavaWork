package Exceptions;

public class Excep1
{
    public static void main(String[] args)
    {
        System.out.println("hello");
        try {
            int x = 80;
            int y = 0;   // arithemetic exception
            int c;
            c = x / y;
            System.out.println(c);
        }
        catch( Exception e)
        {
            System.out.println(e);
        }

        System.out.println("devika");
        System.out.println("sony");
    }
}
