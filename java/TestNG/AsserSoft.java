package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserSoft
{
    @Test
    public void sub()
    {
        int a=30;
        int b=20;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(a-b,10);
    }
}
