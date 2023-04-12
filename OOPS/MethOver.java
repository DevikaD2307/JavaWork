package OOPS;

public class MethOver
{
    void sub( int a, int b)
    {
        System.out.println(a-b);
    }
    void sub( int a, int b, int c)
    {
        System.out.println(a-b-c);
    }

    public static void main(String[] args)
    {
        MethOver m= new MethOver();
        m. sub(5,3, 1);

    }
}
