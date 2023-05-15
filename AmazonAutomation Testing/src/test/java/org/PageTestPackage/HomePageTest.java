package org.PageTestPackage;

import org.BaseClassPackage.BaseClass;
import org.PageClassPackage.HomePage;
import org.PageClassPackage.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass
{
    HomePage homePage;
    SignInPage SignInPage;
    HomePageTest()
    {
      super();
    }
    @BeforeMethod
    public void setUp()
    {
        intialize();
        homePage = new HomePage();
    }
    @Test(priority = 1)
    public void homePageTitleTest()
    {
       String title= homePage.validateHomePageTitle();
        Assert.assertEquals(title, "Amazon");
    }
    @Test(priority = 2)
    public void validateLogoTest()
    {
       boolean logo =homePage.validateLogo();
       Assert.assertTrue(logo);
    }
    @Test(priority = 3)
    public void validateFlagTest()
    {
       boolean flag=homePage.validateFlag();
       Assert.assertTrue(flag);
    }
    @Test(priority = 4)
    public void validateCartIconTest()
    {
        boolean icon=homePage.validateCartIcon();
        Assert.assertTrue(icon);
    }
    @Test(priority = 5)
    public void validateSignInTest()
    {
        SignInPage =homePage.validateSignIn();
    }





}
