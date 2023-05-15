package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1
{
    @DataProvider(name ="TestDemo")
    public Object[][] datatest()
    {
        return new Object[][]{{"Firstname"},{"Lastname"}};
    }
    @Test(dataProvider = "TestDemo")
    public void demo(String val)
    {
        System.out.println(val);
    }

}
