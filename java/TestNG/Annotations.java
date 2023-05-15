package TestNG;

import org.testng.annotations.*;

public  class Annotations
{
    @BeforeSuite
    public void eat()
    {
        System.out.println("Eating fruits");
    }
    @BeforeTest
    public void run()
    {
        System.out.println("Im running");
    }
    @BeforeClass
    public void drink()
    {
        System.out.println("drinking water");
    }
    @BeforeMethod
    public void sleep()
    {
        System.out.println("Im sleeping");
    }
    @Test
    public void perform()
    {
        System.out.println("this is the main to perform the testing");
    }


}