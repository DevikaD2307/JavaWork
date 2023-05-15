package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params
{
    @Test
    @Parameters({"value1", "value2"})
    public void add(int a, int b)
    {
        int sum=a+b;
        System.out.println("The addition of two numbers is : "+ sum);
    }
}
