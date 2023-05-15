package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserHard
{
    @Test
    public void sum()
    {
        int a=10;
        int b=20;
        Assert.assertEquals(a+b,50);
    }

}
N