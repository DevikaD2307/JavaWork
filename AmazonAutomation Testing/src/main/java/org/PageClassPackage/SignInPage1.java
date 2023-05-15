package org.PageClassPackage;

import org.BaseClassPackage.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage1 extends BaseClass
{
    @FindBy(id="ap_password")
    WebElement password;
    @FindBy(linkText ="Forgot your password?")
    WebElement forgotPassword;
    @FindBy(id="signInSubmit")
    WebElement signIn;
    public SignInPage1()
    {
        PageFactory.initElements(driver, this);
    }
    public String validateTitleOfSignIn()
    {
        driver.getTitle();
        return null;
    }
    public boolean validateForgotPassword()
    {
        return forgotPassword.isDisplayed();
    }
    public boolean validatesignInButton()
    {
        return signIn.isDisplayed();
    }
    public LaunchingPage validatesignIn2(String pass)
    {
        password.sendKeys(pass);
        signIn.click();
        return new LaunchingPage();

    }




}
