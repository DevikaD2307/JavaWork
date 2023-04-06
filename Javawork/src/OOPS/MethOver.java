package OOPS;

public class MethOver
{
    void add( int a, int b)
    {
        System.out.println(a+b);
    }
    void add( int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    public static void main(String[] args)
    {
        MethOver m= new MethOver();
        m. add(2,3);

    }
}
