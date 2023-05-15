package org.PageTestPackage;

import junit.framework.Assert;
import org.BaseClassPackage.BaseClass;
import org.PageClassPackage.HomePage;
import org.PageClassPackage.LaunchingPage;
import org.PageClassPackage.SignInPage;
import org.PageClassPackage.SignInPage1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPage1Test extends BaseClass
{
    HomePage homePage;
    SignInPage signInPage;
    SignInPage1 signInPage1;
    LaunchingPage launchingPage;
    public SignInPage1Test()
    {
        super();
    }
    @BeforeMethod
    public void setUp() {
        intialize();
        homePage = new HomePage();
        signInPage = new SignInPage();
        signInPage = homePage.validateSignIn();
        signInPage1 = signInPage.validateSign1(prop.getProperty("username"));

    }
    @Test
    public void signInPage2TitleTest()
    {
        String title=signInPage1.validateTitleOfSignIn();
        Assert.assertEquals(title, "Amazon");
    }
    @Test
    public void validateForgotPasswordTest()
    {
        boolean fpass=signInPage1.validateForgotPassword();
        Assert.assertTrue(fpass);
    }

    @Test
    public void validatesignInButtonTest()
    {
        boolean button=signInPage1.validatesignInButton();
        Assert.assertTrue(button);
    }
    @Test
    public void validatesignIn2Test()
    {
        String launch= signInPage1.validatesignIn2(prop.getProperty("pass")).toString();


    }
    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }


}

