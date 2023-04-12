package Exceptions;

public class Excepthrow
{
    public static void checkAge(int age)
    {
        if (age<18)
        {
            throw new ArithmeticException("you are not eligible");
        }
        else
        {
            System.out.println("you are eligible");
        }

    }

    public static void main(String[] args)
    {
        checkAge(10);
    }
}
