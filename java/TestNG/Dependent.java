package TestNG;

import org.testng.annotations.Test;

public class Dependent
{
    @Test(dependsOnMethods = {"login"})
    public void signIn()
    {
        System.out.println("this is sign in page...");
    }
    @Test
    public void login()
    {
        System.out.println("this is login page");
    }
}