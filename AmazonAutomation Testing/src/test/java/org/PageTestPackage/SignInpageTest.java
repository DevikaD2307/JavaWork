package org.PageTestPackage;

import junit.framework.Assert;
import org.BaseClassPackage.BaseClass;
import org.PageClassPackage.HomePage;
import org.PageClassPackage.SignInPage;
import org.PageClassPackage.SignInPage1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInpageTest extends BaseClass {
    HomePage homePage;
    SignInPage1 signInPage1;
    SignInPage signInPage;

    SignInpageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        intialize();
        homePage = new HomePage();
        signInPage = new SignInPage();
        signInPage = homePage.validateSignIn();
    }

    @Test(priority = 1)
    public void signPageTitleTest() {
        String title = signInPage.signInPageTitle();
        Assert.assertEquals(title, "amazon");
    }

    @Test(priority = 2)
    public void validateContinueTest() {
        boolean con = signInPage.validateContinue();
        Assert.assertTrue(con);
    }

    @Test(priority = 3)
    public void validateCreateAccTest() {
        boolean acc = signInPage.validateCreateAccount();
        Assert.assertTrue(acc);
    }

    @Test(priority = 4)
    public void validateNeedHelpTest() {
        boolean help = signInPage.validateNeedHelp();
        Assert.assertTrue(help);
    }

    @Test(priority = 5)
    public void validateSignTest2() {
        signInPage1 = signInPage.validateSign1(prop.getProperty("number"));

    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }
}


