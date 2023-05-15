package TestNG;

import org.testng.annotations.Test;

public class Parallel1
{
    @Test
    public void add()
    {
        int a=10;
        int b=50;
        int c=a+b;
        System.out.println("The addition is : "+ c);

    }
    @Test
    public void sub()
    {
        int x=50;
        int y=20;
        int z=x-y;
        System.out.println("The Subtraction of two numbers is : "+z);
    }
    @Test
    public void Mul()
    {
        int x=10;
        int y=2;
        int z=x*y;
        System.out.println("The Multiplication of two numbers is : "+z);
    }

}
